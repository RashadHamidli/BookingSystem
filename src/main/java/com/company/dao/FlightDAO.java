package com.company.dao;

import com.company.database.DataBase;
import com.company.entity.Flight;

import java.util.List;
import java.util.Optional;

public class FlightDAO implements DAO<Flight>{
    private DataBase dataBase=new DataBase();
    @Override
    public List<Flight> getAll() {
        return dataBase.getFlights();
    }

    @Override
    public Optional<Flight> getId(int id) {
        return Optional.ofNullable();
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean creat(Flight flight) {
        return false;
    }
}
