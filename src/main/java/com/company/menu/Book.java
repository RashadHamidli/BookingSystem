package com.company.menu;

import com.company.controllers.BookingController;
import com.company.controllers.FlightController;
import com.company.database.DataBase;
import com.company.entity.Booking;
import com.company.entity.Flight;
import com.company.entity.Passenger;
import com.company.entity.User;
import com.company.exceptions.MyException;
import com.company.util.PrintUtil;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.List;

public class Book {
    DataBase dataBase = DataBase.getInstance();
    FlightController flightController = new FlightController();
    BookingController bookingController = new BookingController();

    private int passengerCount;


    public List<Flight> searchFlight() throws Exception {
        List<Flight> foundedFlights;

        String origin = PrintUtil.getText("Enter origin").toUpperCase();
        String destination = PrintUtil.getText("Enter destination").toUpperCase();
        String date = PrintUtil.getText("Enter date (dd.MM.yyyy)");


        try{
            this.passengerCount = PrintUtil.getNum("Enter number of passenger");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!!!");
        }
        foundedFlights = flightController.searchFligth(origin, destination);
        if(foundedFlights.isEmpty()){
            throw new Exception("Not any flight founded\n");
        }
        return foundedFlights;
    }

    public void makeBooking(User user) {
        List<Flight> foundedFlights;
        try{
            foundedFlights = searchFlight();
        }catch (Exception e){
            System.out.println("Not any flight founded\n");
            return;
        }

        foundedFlights.forEach(System.out::println);
        String choice = PrintUtil.getText("Do you want to make a booking ? (Y/N)").toUpperCase();
        if(choice.equals("N")){
            return;
        }

        String code = PrintUtil.getText("Enter flight code").toUpperCase();
        Flight flight = flightController.getFlight(code);

        for (int i = 0; i < passengerCount; i++) {
            int numPass = i + 1;
            String name = PrintUtil.getText("Enter passenger name " + numPass);
            String surname = PrintUtil.getText("Enter passenger surname " + numPass);
            Booking booking = new Booking(user,new Passenger(name, surname), flight, LocalDateTime.now());

            if(bookingController.makeBooking(booking)){
                user.getBookings().add(booking);
                System.out.print("Successfully booked\n");
            }
            else{
                System.out.println("Can not make a booking\n");
            }
        }
    }


    public void cancelBooking(User user){
        showBooking(user);
        int choice;
        try{
            choice = PrintUtil.getNum("Enter booking id");
        }catch (Exception e){
            System.out.println("Invalid input!!!");
            return;
        }

        if(bookingController.cancelBooking(choice)){
            user.getBookings().removeIf(b -> b.getId() == choice);
            System.out.print("Booking cancelled\n");
        }else {
            System.out.print("Can not cancel booking\n");
        }
    }

    public void showBooking(User user){
        bookingController.getBookingsByUser(user).forEach(System.out::println);
    }
//    public List<Flight> searchFlight() {
//        String from = PrintUtil.getText("enter from flight").toUpperCase();
//        String to = PrintUtil.getText("enter flight to").toUpperCase();
//        List<Flight> flights = flightController.searchFligth(from, to);
//        if (flights.isEmpty()) {
//            System.out.println("Flight not found");
//        }
//        return flights;
//    }
//
//    public void makeBooking(User user, String code) {
//        List<Flight> flights = searchFlight();
//        Flight fly = flightController.getFlight(code);
//        if (!flights.isEmpty()) {
//            Booking booking = new Booking(fly, user);
//            if (bookingController.makeBooking(booking)) {
//                user.getBookings().add(booking);
//                System.out.println("flight booking successfully");
//            }
//            dataBase.writeFileDatabase();
//        }
//    }
//
//    public void showBooking(User user) {
//        bookingController.getBookingsByUser(user).forEach(System.out::println);
//    }
//
//    public void cancelBooking(int id) {
//        bookingController.cancelBooking(id);
//    }

}
