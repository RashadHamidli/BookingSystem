package com.company.database;

import com.company.entity.Booking;
import com.company.entity.Flight;
import com.company.entity.User;
import com.company.utils.FlightGenerator;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private static final File flightsFile = new File("src/main/java/com/database", "flights.txt");
    private static final File bookingsFile = new File("src/main/java/com/database", "bookings.txt");
    private static final File usersFile = new File("src/main/java/com/database", "users.txt");

    private final List<Booking> bookings = new ArrayList<>();
    private final List<Flight> flights = new ArrayList<>();
    private final List<User> users = new ArrayList<>();

    private static DataBase dataBase;

    private DataBase() {
    }

    public static DataBase getInstance() {
        if (dataBase == null) {
            dataBase = new DataBase();
        }
        return dataBase;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public List<User> getUsers() {
        return users;
    }

    public void initDatabase() {
        if (usersFile.exists()) {
            loadFileToList(usersFile, users);
        }
        if (bookingsFile.exists()) {
            loadFileToList(bookingsFile, bookings);
        }
        if (flightsFile.exists()) {
            loadFileToList(flightsFile, flights);
        } else {
            flights.addAll(FlightGenerator.genFlights(50));
            saveListToFile(flightsFile, flights);
        }
    }

    public void closeDatabase() {
        saveListToFile(usersFile, users);
        saveListToFile(bookingsFile, bookings);
        saveListToFile(flightsFile, flights);
    }

    public void saveListToFile(File file, List list) {
        try {
            file.getParentFile().mkdirs();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectInputStream = new ObjectOutputStream(fileOutputStream);
            objectInputStream.writeObject(list);
            objectInputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadFileToList(File file, List list) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            if (fileInputStream.available() > 0) {
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                List data = (List) objectInputStream.readObject();
                list.addAll(data);
                objectInputStream.close();
                fileInputStream.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
