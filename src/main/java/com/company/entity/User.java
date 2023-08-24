package com.company.entity;

import java.util.List;
import java.util.Objects;

public class User {
    private static final Long serialVersionUID = 1l;
    private final int id;
    private static int idCount = 1;
    private final String userName;
    private final String name;
    private final String surname;
    private final String password;
    private final List<Booking> bookings;

    public User(int id, String userName, String name, String surname, String password, List<Booking> bookings) {
        idCount = id;
        this.id = id;
        this.userName = userName;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.bookings = bookings;
    }

    public User(String userName, String name, String surname, String password, List<Booking> bookings) {
        this.id = idCount++;
        this.userName = userName;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.bookings = bookings;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassword() {
        return password;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userName, user.userName) && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(password, user.password) && Objects.equals(bookings, user.bookings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, name, surname, password, bookings);
    }
}

