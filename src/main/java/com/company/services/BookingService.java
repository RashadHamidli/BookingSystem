package com.company.services;

import com.company.dao.BookingDAO;
import com.company.entity.Booking;

import java.util.List;

public class BookingService {
    private BookingDAO bookingDAO = new BookingDAO();

    public boolean makeBooking(Booking booking) {
        return bookingDAO.creat(booking);
    }

    public List<Booking> getBookings() {
        return bookingDAO.getAll();
    }

    public Booking getBooking(int id) {
        return bookingDAO.getAll().get(id);
    }

}
