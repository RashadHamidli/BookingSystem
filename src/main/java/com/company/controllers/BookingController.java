package com.company.controllers;

import com.company.entity.Booking;
import com.company.services.BookingService;

public class BookingController {
    private BookingService bookingService = new BookingService();

    public boolean makeBooking(Booking booking) {
        return bookingService.makeBooking(booking);
    }
}
