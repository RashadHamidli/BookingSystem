package com.company.util;

import com.company.entity.Airline;
import com.company.entity.Airport;
import com.company.entity.Flight;

import java.io.FileReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class FlightGenerator {
    private static Random random = new Random();

    public static int genCapacity() {
        return random.nextInt(50, 100);
    }

    private static Airline genAirline() {
        return Airline.values()[random.nextInt(Airline.values().length)];
    }

    public static Airport genAirpot() {
        return Airport.values()[random.nextInt(Airport.values().length)];
    }

    public static LocalDateTime genTime() {
        long minDay = LocalDate.of(2023, 9, 1).toEpochDay();
        long maxDay = LocalDate.of(2023, 12, 31).toEpochDay();
        long randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay);
        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        LocalTime randomTime = LocalTime.of(random.nextInt(24), (random.nextInt(60) / 30) * 30);
        return LocalDateTime.of(randomDate, randomTime);
    }

    public static List<Flight> genFlights(int times) {
        Flight flight = new Flight();
        List<Flight> flights = new ArrayList<>();
        for (int i = 0; i < times; i++) {
            int capacity = genCapacity();
            LocalDateTime dateTime = genTime();
            Airline airline = genAirline();
            Airport from = genAirpot();
            Airport to = genAirpot();
            flights.add(new Flight(capacity, flight.getCode(), airline, from, to, dateTime, null));
        }
        return flights;
    }
}
