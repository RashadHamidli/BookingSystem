package com.company.menu;

import com.company.controllers.BookingController;
import com.company.controllers.FlightController;
import com.company.database.DataBase;
import com.company.entity.Booking;
import com.company.entity.Flight;
import com.company.entity.User;
import com.company.util.PrintUtil;

import java.util.List;

public class Book {
    DataBase dataBase = DataBase.getInstance();
    FlightController flightController = new FlightController();
    BookingController bookingController = new BookingController();

    public List<Flight> searchFlight() {
        String from = PrintUtil.getText("enter from flight").toUpperCase();
        String to = PrintUtil.getText("enter flight to").toUpperCase();
        List<Flight> flights = flightController.searchFligth(from, to);
        if (flights.isEmpty()) {
            System.out.println("Flight not found");
        }
        return flights;
    }

    public void makeBooking(User user, String code) {
        List<Flight> flights = searchFlight();
        Flight fly = flightController.getFlight(code);
        if (!flights.isEmpty()) {
            Booking booking = new Booking(fly, user);
            if (bookingController.makeBooking(booking)) {
                user.getBookings().add(booking);
                System.out.println("flight booking successfully");
            }
            dataBase.writeFileDatabase();
        }
    }

    public void showBooking(User user) {
        bookingController.getBookingsByUser(user).forEach(System.out::println);
    }

    public void cancelBooking(int id) {
        bookingController.cancelBooking(id);
    }

}
