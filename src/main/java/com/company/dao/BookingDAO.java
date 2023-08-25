package com.company.dao;


import com.company.database.DataBase;
import com.company.entity.Booking;

import java.util.List;
import java.util.Optional;

public class BookingDAO implements DAO<Booking> {
    private DataBase dataBase = new DataBase();

    @Override
    public List<Booking> getAll() {
        return dataBase.getBookings();
    }

    @Override
    public Optional<Booking> getId(int id) {
        return Optional.ofNullable(dataBase.getBookings().get(id));
    }

    @Override
    public boolean delete(int id) {
        return dataBase.getBookings().removeIf(x -> x.getId() == id);
    }

    @Override
    public boolean creat(Booking booking) {
        if (booking == null)
            return false;
        if (dataBase.getBookings().contains(booking))
            return false;
        dataBase.getBookings().add(booking);
        return true;
    }
}
