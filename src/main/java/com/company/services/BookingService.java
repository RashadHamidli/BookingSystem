package com.company.services;

import com.company.dao.BookingDao;
import com.company.entity.Booking;
import com.company.entity.User;

import java.util.List;

public class BookingService {
    private BookingDao bookingDao = new BookingDao();

    public boolean makeBooking(Booking booking) {
        return bookingDao.create(booking);
    }

    public Booking getBooking(int id) {
        return bookingDao.getAll().get(id);
    }

    public List<Booking> getBookings() {
        return bookingDao.getAll();
    }
    public List<Booking> getBookingsByUser(User user){
        return bookingDao.getAll().stream().filter(b -> b.getUser().equals(user)).toList();
    }
    public boolean cancelBooking(int id){
        return bookingDao.delete(id);
    }

}
