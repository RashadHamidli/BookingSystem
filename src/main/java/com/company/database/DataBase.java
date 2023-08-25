package com.company.database;

import com.company.dao.UserDAO;
import com.company.entity.Booking;
import com.company.entity.Flight;
import com.company.entity.User;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<User> users = new ArrayList<>();
    private List<Flight> flights = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();

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
