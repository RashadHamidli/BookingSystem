package com.company.entity;

import com.company.database.DataBase;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private static int idCount = 1;
    private String userName;
    private String name;
    private String surname;
    private String password;
    private final List<Booking> bookings;

    public User(String userName, String name, String surname, String password, ArrayList<Booking> bookings) {
        List<User> users = DataBase.getInstance().getUsers();
        int size = 0;
        for (User u : users) {
            size = u.getId();
        }
        this.id = ++size;
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
        return id == user.id && Objects.equals(userName, user.userName) && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(password, user.password) && Objects.equals(bookings, user.bookings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, name, surname, password, bookings);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", password='" + password + '\'' +
                ", bookings=" + bookings +
                '}';
    }
}
