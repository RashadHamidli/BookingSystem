package com.company.entity;

import java.util.List;
import java.util.Objects;

public class Passenger {
    private static final long serialVersionUID = 1l;
    private static int idCount = 1;
    private int id;
    private String name;
    private String surname;

    public Passenger(String name, String surname) {
        this.id = idCount++;
        this.name = name;
        this.surname = surname;
    }

    public Passenger(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public static int getIdCount() {
        return idCount;
    }

    public static void setIdCount(int idCount) {
        Passenger.idCount = idCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return id == passenger.id && Objects.equals(name, passenger.name) && Objects.equals(surname, passenger.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname);
    }
}
