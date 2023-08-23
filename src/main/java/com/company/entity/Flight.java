package com.company.entity;

import java.time.LocalDateTime;
import java.util.List;

public class Flight {
    private static final long serialUID=1l;
    private int idCount;
    private int capacity;
    private String code;
    private LocalDateTime takeOfTime;
    private Airline airline;
    private Airport from;
    private Airport to;
    private List<Passenger> passengers;

    public Flight(int capacity, String code, LocalDateTime takeOfTime, Airline airline, Airport from, Airport to, List<Passenger> passengers) {
        this.idCount = idCount++;
        this.capacity = capacity;
        this.code = code;
        this.takeOfTime = takeOfTime;
        this.airline = airline;
        this.from = from;
        this.to = to;
        this.passengers = passengers;
    }

    public Flight(int idCount, int capacity, String code, LocalDateTime takeOfTime, Airline airline, Airport from, Airport to, List<Passenger> passengers) {
        this.idCount = idCount;
        this.capacity = capacity;
        this.code = code;
        this.takeOfTime = takeOfTime;
        this.airline = airline;
        this.from = from;
        this.to = to;
        this.passengers = passengers;
    }

    public int getIdCount() {
        return idCount;
    }

    public void setIdCount(int idCount) {
        this.idCount = idCount;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDateTime getTakeOfTime() {
        return takeOfTime;
    }

    public void setTakeOfTime(LocalDateTime takeOfTime) {
        this.takeOfTime = takeOfTime;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public Airport getFrom() {
        return from;
    }

    public void setFrom(Airport from) {
        this.from = from;
    }

    public Airport getTo() {
        return to;
    }

    public void setTo(Airport to) {
        this.to = to;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "idCount=" + idCount +
                ", capacity=" + capacity +
                ", code='" + code + '\'' +
                ", takeOfTime=" + takeOfTime +
                ", airline=" + airline +
                ", from=" + from +
                ", to=" + to +
                ", passengers=" + passengers +
                '}';
    }
}
