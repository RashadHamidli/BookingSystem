package com.company.controllers;

import com.company.entity.Booking;
import com.company.entity.User;
import com.company.services.BookingService;

import java.util.List;

public class BookingController {
    private BookingService bookingService = new BookingService();

    public boolean makeBooking(Booking booking) {
        return bookingService.makeBooking(booking);
    }

    public boolean cancelBooking(int id) {
        return bookingService.cancelBooking(id);
    }

    public List<Booking> getBookingsByUser(User user) {
        return bookingService.getBookingByUser(user);
    }
}
