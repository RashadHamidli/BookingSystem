package com.company.db;

import com.company.entity.Booking;
import com.company.entity.Flight;
import com.company.entity.User;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private static final File usersFile=new File("");
    private static final File bookingFile=new File("");
    private static final File flightsFile=new File("");
    private List<User> users = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();
    private List<Flight> flights = new ArrayList<>();
    private static DataBase dataBase;

    public List<User> getUsers() {
        return users;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public List<Flight> getFlights() {
        return flights;
    }
}
