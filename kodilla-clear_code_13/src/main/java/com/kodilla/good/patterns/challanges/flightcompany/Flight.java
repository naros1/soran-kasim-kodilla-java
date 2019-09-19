package com.kodilla.good.patterns.challanges.flightcompany;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Flight {
    private String depatureCity;
    private String arrvivalCity;
    private LocalTime duration;

    public Flight(String depatureCity, String arrvivalCity, LocalTime duration) {
        this.depatureCity = depatureCity;
        this.arrvivalCity = arrvivalCity;
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!depatureCity.equals(flight.depatureCity)) return false;
        if (!arrvivalCity.equals(flight.arrvivalCity)) return false;
        return duration.equals(flight.duration);
    }

    @Override
    public int hashCode() {
        int result = depatureCity.hashCode();
        result = 31 * result + arrvivalCity.hashCode();
        result = 31 * result + duration.hashCode();
        return result;
    }

    public String getDepatureCity() {
        return depatureCity;
    }

    public String getArrvivalCity() {
        return arrvivalCity;
    }

    public LocalTime getDuration() {
        return duration;
    }
}
