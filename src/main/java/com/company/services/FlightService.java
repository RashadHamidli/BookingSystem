package com.company.services;


import com.company.dao.FlightDAO;
import com.company.entity.Flight;

import java.util.List;

public class FlightService {
    private FlightDAO flightDAO = new FlightDAO();

    public List<Flight> getFlights(){
        return flightDAO.getAll();
    }
    public Flight getFlight(String code){
        return flightDAO.getAll().stream().filter(f->f.getCode().equals(code)).findFirst().get();
    }
}
