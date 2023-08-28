package com.company.services;

import com.company.dao.BookingDAO;
import com.company.entity.Booking;
import com.company.entity.User;

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

    public boolean cancelBooking(int id) {
        return bookingDAO.delete(id);
    }

    public List<Booking> getBookingByUser(User user) {
        return bookingDAO.getAll().stream().filter(b -> b.getUser().equals(user)).toList();
    }

}
