package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;


public class FlightFinder {

    private Map<String, Boolean> airports;

    public FlightFinder() {
        airports = new HashMap<>();
    }


    public void findFlight(Flight flight) throws RouteNotFoundException {
        airports.put("Berlin", true);
        airports.put("Wroclaw", true);


        if (flight.getArrivalAirport().equals("Wroclaw") || flight.getDeptureAirport().equals("Wroclaw")) {
            airports.put("Hamburg", true);
        } else if (flight.getDeptureAirport().equals("Berlin") || flight.getArrivalAirport().equals("Berlin")) {
            airports.put("Hamburg", false);
        }

        if (airports.get(flight.getArrivalAirport()) != null && airports.get(flight.getDeptureAirport()) != null) {

            if (airports.get(flight.getArrivalAirport()) && airports.get(flight.getDeptureAirport())) {

                System.out.println("You can travel form : " + flight.getDeptureAirport() + " to : " + flight.getArrivalAirport());
            } else {

                System.out.println("Airports existing, but there is no direct flight existing");

            }

        } else {

            throw new RouteNotFoundException("Airport is not on the list");
        }

    }

}