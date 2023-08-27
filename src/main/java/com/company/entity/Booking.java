package com.company.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class Booking implements Serializable {
    private int id;
    private static int idCount = 1;
    private User user;
    private Passenger passenger;
    private Flight flight;
    private LocalDateTime bookingDate;

    private Booking(int id) {
        this.id = id;
        this.user = user;
        this.passenger = passenger;
        this.flight = flight;
        this.bookingDate = bookingDate;
    }

    public Booking(User user, Passenger passenger, Flight flight, LocalDateTime bookingDate) {
        this.id = idCount++;
        this.user = user;
        this.passenger = passenger;
        this.flight = flight;
        this.bookingDate = bookingDate;
    }

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public LocalDateTime getBookingDate() {
        return bookingDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return id == booking.id && Objects.equals(user, booking.user) && Objects.equals(passenger, booking.passenger) && Objects.equals(flight, booking.flight) && Objects.equals(bookingDate, booking.bookingDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, passenger, flight, bookingDate);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", user=" + user +
                ", passenger=" + passenger +
                ", flight=" + flight +
                ", bookingDate=" + bookingDate +
                '}';
    }
}
