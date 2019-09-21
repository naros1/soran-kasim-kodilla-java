package com.kodilla.good.patterns.challanges.flightcompany;

import java.util.List;

public class BookRequest {
    private String name;
    private String surname;
    private List<String> flightToBook;

    public BookRequest(String name, String surname, List<String> flightToBook) {
        this.name = name;
        this.surname = surname;
        this.flightToBook = flightToBook;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public List<String> getFlightToBook() {
        return flightToBook;
    }
}
