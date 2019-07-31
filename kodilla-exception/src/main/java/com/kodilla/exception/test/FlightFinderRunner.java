package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args){
        Flight flight = new Flight("Wroclaw", "Berlin");
        FlightFinder flightFinder = new FlightFinder();

        flightFinder.addAirport("Wroclaw", true);
        flightFinder.addAirport("Berlin", true);
        flightFinder.addAirport("Hamburg", false);

        try {
            flightFinder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Flight not existing! Try other destinations!");
        }


    }
}
