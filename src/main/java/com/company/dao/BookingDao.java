package com.company.dao;

import com.company.database.DataBase;
import com.company.entity.Booking;

import java.util.List;
import java.util.Optional;

public class BookingDao implements Dao<Booking> {
    private DataBase dataBase = DataBase.getInstance();

    @Override
    public List getAll() {
        return dataBase.getBookings();
    }

    @Override
    public Optional get(int id) {
        return Optional.ofNullable(dataBase.getBookings().get(id));
    }

    @Override
    public boolean delete(int id) {
        return dataBase.getBookings().removeIf(booking -> booking.getId() == id);
    }

    @Override
    public boolean create(Booking booking) {
        if (booking == null)
            return false;
        if (dataBase.getBookings().contains(booking))
            return false;
        dataBase.getBookings().add(booking);
        return true;
    }
}
