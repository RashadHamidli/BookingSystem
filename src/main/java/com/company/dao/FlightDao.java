package com.company.dao;

import com.company.database.DataBase;
import com.company.entity.Flight;

import java.util.List;
import java.util.Optional;

public class FlightDao implements Dao<Flight> {
    private DataBase dataBase = DataBase.getInstance();

    @Override
    public List getAll() {
        return dataBase.getFlights();
    }

    @Override
    public Optional get(int id) {
        return Optional.ofNullable(dataBase.getFlights().get(id));
    }

    @Override
    public boolean delete(int id) {
        return dataBase.getFlights().removeIf(flight -> flight.getId() == id);
    }

    @Override
    public boolean create(Flight flight) {
        if (flight == null)
            return false;
        if (dataBase.getFlights().contains(flight))
            return false;
        dataBase.getFlights().add(flight);
        return true;
    }

}
