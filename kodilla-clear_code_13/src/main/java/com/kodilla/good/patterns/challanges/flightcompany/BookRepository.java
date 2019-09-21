package com.kodilla.good.patterns.challanges.flightcompany;

import java.util.HashMap;

public class BookRepository {
    private HashMap<String, BookRequest> bookingList = new HashMap<>();

    public void createBooking(BookRequest book) {
        String person = book.getName() + " " + book.getSurname();
        bookingList.put(person, book);
        System.out.println("Dodano nową rezerwacje do list : " + person + " | Zarezerwowane loty : " + book.getFlightToBook().toString());
    }
}
