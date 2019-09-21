package com.kodilla.good.patterns.challanges.flightcompany;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Flight {
    private String depatureCity;
    private String arrvivalCity;
    private LocalDateTime depature;
    private LocalDateTime arvival;
    private String flihgtNumber;

    public Flight(String depatureCity, String arrvivalCity, LocalDateTime depature, LocalDateTime arvival, String flihgtNumber) {
        this.depatureCity = depatureCity;
        this.arrvivalCity = arrvivalCity;
        this.depature = depature;
        this.arvival = arvival;
        this.flihgtNumber = flihgtNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!depatureCity.equals(flight.depatureCity)) return false;
        if (!arrvivalCity.equals(flight.arrvivalCity)) return false;
        return depature.equals(flight.depature);
    }

    @Override
    public int hashCode() {
        int result = depatureCity.hashCode();
        result = 31 * result + arrvivalCity.hashCode();
        result = 31 * result + depature.hashCode();
        return result;
    }

    public String getDepatureCity() {
        return depatureCity;
    }

    public String getArrvivalCity() {
        return arrvivalCity;
    }

    public LocalDateTime getDepature() {
        return depature;
    }

    public LocalDateTime getArvival() {
        return arvival;
    }

    public String getFlihgtNumber() {
        return flihgtNumber;
    }
}
