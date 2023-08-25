package com.company.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class Booking {
    private static final long serialVersionUID = 1l;
    private final int id;
    private static int idCount = 1;
    private final Flight flight;
    private final User user;
    private final Passanger passanger;
    private final LocalDateTime bookingTime;

    public Booking(int id, Flight flight, User user, Passanger passanger, LocalDateTime bookingTime) {
        idCount = id;
        this.id = id;
        this.flight = flight;
        this.user = user;
        this.passanger = passanger;
        this.bookingTime = bookingTime;
    }

    public Booking(Flight flight, User user, Passanger passanger, LocalDateTime bookingTime) {
        this.id = idCount++;
        this.flight = flight;
        this.user = user;
        this.passanger = passanger;
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

    public Passanger getPassanger() {
        return passanger;
    }

    public LocalDateTime getBookingTime() {
        return bookingTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return id == booking.id && Objects.equals(user, booking.user) && Objects.equals(passanger, booking.passanger) && Objects.equals(bookingTime, booking.bookingTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, passanger, bookingTime);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", flight=" + flight +
                ", user=" + user +
                ", passanger=" + passanger +
                ", bookingTime=" + bookingTime +
                '}';
    }
}
