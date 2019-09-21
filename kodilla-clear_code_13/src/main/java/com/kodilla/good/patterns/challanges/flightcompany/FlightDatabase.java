package com.kodilla.good.patterns.challanges.flightcompany;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightDatabase {
    private List<Flight> flightDatabase = new ArrayList<>();

    public FlightDatabase() {
    }

    public void addFlightToDatabase(Flight flight) {
        flightDatabase.add(flight);
    }

    public List<Flight> getFlightDatabase() {
        return flightDatabase;
    }
}
