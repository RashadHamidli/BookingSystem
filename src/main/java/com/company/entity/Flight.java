package com.company.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Flight implements Serializable {
    private int id;
    private static int idCount = 1;
    private int capacity;
    private String code;
    private Airline airline;
    private Airport from;
    private Airport to;
    private LocalDateTime flightDate;
    private List<Passenger> passengerList;

    public Flight(int capacity, String code, Airline airline, Airport from, Airport to, LocalDateTime flightDate, List<Passenger> passengerList) {
        this.id = idCount++;
        this.capacity = capacity;
        this.code = code;
        this.airline = airline;
        this.from = from;
        this.to = to;
        this.flightDate = flightDate;
        this.passengerList = passengerList;
    }

    public int getId() {
        return id;
    }

    public static int getIdCount() {
        return idCount;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getCode() {
        return code;
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

    public LocalDateTime getFlightDate() {
        return flightDate;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return id == flight.id && capacity == flight.capacity && Objects.equals(code, flight.code) && airline == flight.airline && from == flight.from && to == flight.to && Objects.equals(flightDate, flight.flightDate) && Objects.equals(passengerList, flight.passengerList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, capacity, code, airline, from, to, flightDate, passengerList);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", capacity=" + capacity +
                ", code='" + code + '\'' +
                ", airline=" + airline +
                ", from=" + from +
                ", to=" + to +
                ", flightDate=" + flightDate +
                ", passengerList=" + passengerList +
                '}';
    }
}
