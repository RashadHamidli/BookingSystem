package com.company;

import com.company.database.DataBase;
import com.company.entity.Flight;
import com.company.menu.Menu;
import com.company.util.FlightGenerator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataBase dataBase = DataBase.getInstance();
        dataBase.readFileDatabase();
        Menu menu = new Menu();
        menu.displayMenu();

//        List<Flight> flights = FlightGenerator.genFlights(50);
//        flights.forEach(System.out::println);

    }
}
