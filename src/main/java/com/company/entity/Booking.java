package com.company.entity;

import java.time.LocalDateTime;
import java.util.List;

public class Booking {
    private static final long serialVersionUID =1l;
    private int idCount=1;
    private int id;
    private Flight flights;
    private Passenger passengers;
    private User user;
    private LocalDateTime bookedTime;

    public Booking( Flight flights, Passenger passengers, User user, LocalDateTime bookedTime) {
        this.idCount = idCount++;
        this.id = id;
        this.flights = flights;
        this.passengers = passengers;
        this.user = user;
        this.bookedTime = bookedTime;
    }

    public Booking(int id, Flight flights, Passenger passengers, User user, LocalDateTime bookedTime) {
        this.idCount = idCount;
        this.id = id;
        this.flights = flights;
        this.passengers = passengers;
        this.user = user;
        this.bookedTime = bookedTime;
    }
}
