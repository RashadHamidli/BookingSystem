package com.company.database;

import com.company.entity.Booking;
import com.company.entity.Flight;
import com.company.entity.User;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<User> users = new ArrayList<>();
    private List<Flight> flights = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();
    private static DataBase database;
    private DataBase(){
    }
    public static DataBase getInstance(){
        if(database == null){
            database =  new DataBase();
        }
        return database;
    }
    public List<User> getUsers() {
        return users;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public List<Booking> getBookings() {
        return bookings;
    }
}
