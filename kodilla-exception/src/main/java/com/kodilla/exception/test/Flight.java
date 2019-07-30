package com.kodilla.exception.test;

public class Flight {
    private String deptureAirport;
    private String arrivalAirport;

    public Flight(String deptureAirport, String arrivalAirport) {
        this.deptureAirport = deptureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDeptureAirport() {
        return deptureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }
}
