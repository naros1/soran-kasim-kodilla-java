package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;


public class FlightFinder {

    private Map<String, Boolean> airports;

    public FlightFinder() {
        airports = new HashMap<>();
    }

    public void addAirport(String name, Boolean status){
        airports.put(name,status);
    }


    public void findFlight(Flight flight) throws RouteNotFoundException {

        if (airports.get(flight.getArrivalAirport()) != null && airports.get(flight.getDeptureAirport()) != null) {

            if (airports.get(flight.getArrivalAirport()) && !flight.getArrivalAirport().equals(flight.getDeptureAirport())) {

                System.out.println("You can travel form : " + flight.getDeptureAirport() + " to : " + flight.getArrivalAirport());
            } else {

                System.out.println("Airports existing, but there is no direct flight existing");

            }

        } else {

            throw new RouteNotFoundException("Airport is not on the list");
        }

    }

}