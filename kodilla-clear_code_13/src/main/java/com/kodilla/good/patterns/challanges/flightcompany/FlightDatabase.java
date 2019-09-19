package com.kodilla.good.patterns.challanges.flightcompany;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightDatabase {
    private Map<Flight, LocalDateTime> flightDatabase;

    public FlightDatabase(Map<Flight, LocalDateTime> flightDatabase) {
        this.flightDatabase = new HashMap<>();
    }

    public boolean addFlightToDatabase(Flight flight, LocalDateTime localDateTime){
        flightDatabase.put(flight,localDateTime);
        return true;
    }
    
    public String serchFlight(String depature, String arvvival, LocalDateTime localDateTime){
        String result = flightDatabase.entrySet().stream()
                .filter(s->s.getKey().getDepatureCity().equals(depature))
                .filter(s->s.getKey().getArrvivalCity().equals(arvvival))
                .filter(s->s.getValue().isAfter(localDateTime))
                .map(s->s.getKey().getDepatureCity()+s.getValue())
                .collect(Collectors.joining());


        
    return String
    }


}
