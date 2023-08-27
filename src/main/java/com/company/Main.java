package com.company;

import com.company.database.DataBase;
import com.company.menu.Menu;

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
