package com.kodilla.good.patterns.challanges.flightcompany;

import java.awt.print.Book;

public class BookingService {
    public boolean bookFlight(BookRequest bookRequest) {
        System.out.println("Zarezerwował : " + bookRequest.getName() + " | " + bookRequest.getSurname() +
                "\n Loty" + bookRequest.getFlightToBook().toString());
        return true;
    }
}
