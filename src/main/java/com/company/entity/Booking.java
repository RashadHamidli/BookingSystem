package com.company.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class Booking {
    private static final long serialVersionUID = 1l;
    private final int id;
    private static int idCount = 1;
    private final Flight flight;
    private final User user;
    private final Passenger passenger;
    private final LocalDateTime bookingTime;

    public Booking(int id, Flight flight, User user, Passenger passenger, LocalDateTime bookingTime) {
        idCount = id;
        this.id = id;
        this.flight = flight;
        this.user = user;
        this.passenger = passenger;
        this.bookingTime = bookingTime;
    }

    public Booking(Flight flight, User user, Passenger passenger, LocalDateTime bookingTime) {
        this.id = idCount++;
        this.flight = flight;
        this.user = user;
        this.passenger = passenger;
        this.bookingTime = bookingTime;
    }

    public int getId() {
        return id;
    }

    public Flight getFlight() {
        return flight;
    }

    public User getUser() {
        return user;
    }

    public Passenger getPassanger() {
        return passenger;
    }

    public LocalDateTime getBookingTime() {
        return bookingTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return id == booking.id && Objects.equals(user, booking.user) && Objects.equals(passenger, booking.passenger) && Objects.equals(bookingTime, booking.bookingTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, passenger, bookingTime);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", flight=" + flight +
                ", user=" + user +
                ", passenger=" + passenger +
                ", bookingTime=" + bookingTime +
                '}';
    }
}
