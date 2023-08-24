package com.company.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Flight {
    private static final long serialVersionUID = 1l;

    private final int id;
    private static int idCount = 1;
    private final int capacity;
    private final String code;
    private final LocalDateTime takeOffTime;
    private final Airline airline;
    private final Airport from;
    private final Airport to;
    private final List<Passanger> passangerList;

    public Flight(int capacity, String code, LocalDateTime takeOffTime, Airline airline, Airport from, Airport to, List<Passanger> passangerList) {
        this.id = idCount++;
        this.capacity = capacity;
        this.code = generationCode();
        this.takeOffTime = takeOffTime;
        this.airline = airline;
        this.from = from;
        this.to = to;
        this.passangerList = passangerList;
    }

    public Flight(int id, int capacity, String code, LocalDateTime takeOffTime, Airline airline, Airport from, Airport to, List<Passanger> passangerList) {
        idCount = id;
        this.id = id;
        this.capacity = capacity;
        this.code = code;
        this.takeOffTime = takeOffTime;
        this.airline = airline;
        this.from = from;
        this.to = to;
        this.passangerList = passangerList;
    }

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getCode() {
        return code;
    }

    public LocalDateTime getTakeOffTime() {
        return takeOffTime;
    }

    public Airline getAirline() {
        return airline;
    }

    public Airport getFrom() {
        return from;
    }

    public Airport getTo() {
        return to;
    }

    public List<Passanger> getPassangerList() {
        return passangerList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return id == flight.id && capacity == flight.capacity && Objects.equals(code, flight.code) && Objects.equals(takeOffTime, flight.takeOffTime) && airline == flight.airline && from == flight.from && to == flight.to && Objects.equals(passangerList, flight.passangerList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, capacity, code, takeOffTime, airline, from, to, passangerList);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", capacity=" + capacity +
                ", code='" + code + '\'' +
                ", takeOffTime=" + takeOffTime +
                ", airline=" + airline +
                ", from=" + from +
                ", to=" + to +
                ", passangerList=" + passangerList +
                '}';
    }

    private String generationCode() {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(random.nextInt(10, 99));
        stringBuilder.append(this.airline.toString().substring(0, 2));
        stringBuilder.append(this.from.toString().charAt(0));
        stringBuilder.append(this.to.toString().charAt(0));
        return stringBuilder.toString();
    }
}
