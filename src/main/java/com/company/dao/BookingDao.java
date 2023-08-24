package com.company.dao;

import java.util.List;
import java.util.Optional;

public class BookingDao implements Dao{
    @Override
    public List getAll() {
        return null;
    }

    @Override
    public Optional get(int id) {
        return Optional.empty();
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean create(Object o) {
        return false;
    }
}
