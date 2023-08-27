package com.company.menu;

import com.company.controllers.FlightController;
import com.company.database.DataBase;
import com.company.entity.Flight;
import com.company.entity.User;
import com.company.util.PrintUtil;

import java.util.List;

public class Book {
    DataBase dataBase = DataBase.getInstance();
    FlightController flightController = new FlightController();

    public List<Flight> searchFlight() {
        String from = PrintUtil.getText("enter from flight").toUpperCase();
        String to = PrintUtil.getText("enter flight to").toUpperCase();
        List<Flight> flights = flightController.searchFligth(from, to);
        if(flights.isEmpty()){
            System.out.println("Flight not found");
        }
        return flights;
    }
    public void makeBooking(User user){
        List<Flight> flights=searchFlight();
    }

}
