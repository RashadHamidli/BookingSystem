package com.company.controllers;

import com.company.entity.Flight;
import com.company.services.FlightService;

import java.util.List;

public class FlightController {
    private FlightService flightService = new FlightService();

    public List<Flight> getFlights() {
        return flightService.getFlights();
    }

    public Flight getFlight(String code) {
        return flightService.getFlight(code);
    }

}
