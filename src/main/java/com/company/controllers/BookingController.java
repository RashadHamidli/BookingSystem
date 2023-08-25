package com.company.controllers;



import com.company.entity.Booking;
import com.company.entity.User;
import com.company.services.BookingService;

import java.util.List;

public class BookingController {
    BookingService bookingService = new BookingService();
    public boolean makeBooking(Booking booking){
        return bookingService.makeBooking(booking);
    }

    public Booking getBooking(int id){
        return bookingService.getBooking(id);
    }

    public List<Booking> getBookings(){
        return bookingService.getBookings();
    }
    public boolean cancelBooking(int id){
        return bookingService.cancelBooking(id);
    }
    public List<Booking> getBookingsByUser(User user){
        return bookingService.getBookingsByUser(user);
    }

}
