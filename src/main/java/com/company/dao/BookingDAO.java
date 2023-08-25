package com.company.dao;


import com.company.entity.Booking;

import java.util.List;
import java.util.Optional;

public class BookingDAO implements DAO<Booking> {
    @Override
    public List<Booking> getAll() {
        return null;
    }

    @Override
    public Optional<Booking> getId(int id) {
        return Optional.empty();
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean creat(Booking booking) {
        return false;
    }
}
