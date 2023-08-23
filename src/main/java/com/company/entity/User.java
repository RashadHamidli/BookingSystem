package com.company.entity;

import java.util.List;
import java.util.Objects;

public class User {
    private static final long serialVersionUID =1l;
    private static int idCount=1;
    private int id;
    private String userName;
    private String name;
    private String surname;
    private List<Booking> bookingList;

    public User(String userName, String name, String surname, List<Booking> bookingList) {
        this.id = idCount++;
        this.userName = userName;
        this.name = name;
        this.surname = surname;
        this.bookingList = bookingList;
    }

    public User(int id, String userName, String name, String surname, List<Booking> bookingList) {
        this.id = id;
        this.userName = userName;
        this.name = name;
        this.surname = surname;
        this.bookingList = bookingList;
    }

    public static int getIdCount() {
        return idCount;
    }

    public static void setIdCount(int idCount) {
        User.idCount = idCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", bookingList=" + bookingList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(userName, user.userName) && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(bookingList, user.bookingList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, name, surname, bookingList);
    }
}
