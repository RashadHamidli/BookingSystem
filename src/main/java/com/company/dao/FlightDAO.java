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
        return Optional.ofNullable(dataBase.getFlights().get(id));
    }

    @Override
    public boolean delete(int id) {
        return dataBase.getFlights().removeIf(x->x.getId()==id);
    }

    @Override
    public boolean creat(Flight flight) {
        if(flight==null)
            return false;
        if(dataBase.getFlights().contains(flight))
            return false;
        dataBase.getFlights().add(flight);
        return true;
    }
}
