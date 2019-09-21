package com.kodilla.good.patterns.challanges.flightcompany;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightProcessor {
    private BookingService bookingService;
    private BookRepository bookRepository;

    public FlightProcessor(BookingService bookingService, BookRepository bookRepository) {
        this.bookingService = bookingService;
        this.bookRepository = bookRepository;
    }

    public List serchFlight(SerchRequest serchRequest, List<Flight> flightDatabase) {
        List<Flight> result = new ArrayList<>();
        List<Flight> directFlight = flightDatabase.stream()
                .filter(s -> s.getDepatureCity().equals(serchRequest.getDpeatureCity()))
                .filter(s -> s.getArrvivalCity().equals(serchRequest.getArvivalCity()))
                .filter(s -> s.getDepature().isAfter(serchRequest.getDepatureSerchDate()))
                .collect(Collectors.toList());
        List<Flight> isArvival = flightDatabase.stream()
                .filter(s -> s.getArrvivalCity().equals(serchRequest.getArvivalCity()))
                .filter(s -> s.getDepature().isAfter(serchRequest.getDepatureSerchDate()))
                .collect(Collectors.toList());
        for (Flight flight : flightDatabase
        ) {
            for (Flight flightWithArvival : isArvival
            ) {
                if (flight.getArrvivalCity().equals(flightWithArvival.getDepatureCity())
                        && flight.getDepatureCity().equals(serchRequest.getDpeatureCity()) && flight.getArvival().isBefore(flightWithArvival.getDepature())) {
                    result.add(flight);
                    result.add(flightWithArvival);
                }
            }
        }
        result.addAll(directFlight);
        return result;
    }

    public String printResult(List<Flight> flightDatabase) {
        String result = "";
        for (Flight flight : flightDatabase
        ) {
            result = result + "Wylot z : " + flight.getDepatureCity() + " o godzinie : " + flight.getDepature().toString()
                    + " | Przyolot do : " + flight.getArrvivalCity() + " o godzinie : " + flight.getArvival().toString() + " | Numer Lotu : " + flight.getFlihgtNumber() + "\n";
        }
        return result;
    }

    public BookDto processBooking(BookRequest bookRequest) {
        boolean isBooked = bookingService.bookFlight(bookRequest);

        if (isBooked) {
            bookRepository.createBooking(bookRequest);
            return new BookDto(bookRequest, true);
        } else {
            return new BookDto(bookRequest, false);
        }
    }
}
