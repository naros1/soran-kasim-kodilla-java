package com.kodilla.good.patterns.challanges.flightcompany;


import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        LocalDateTime depature1 = LocalDateTime.of(2019, 10, 4, 12, 30);
        LocalDateTime depature2 = LocalDateTime.of(2019, 10, 4, 17, 30);
        LocalDateTime depature3 = LocalDateTime.of(2019, 10, 4, 11, 30);
        LocalDateTime arvival1 = LocalDateTime.of(2019, 10, 4, 14, 30);
        LocalDateTime arvival2 = LocalDateTime.of(2019, 10, 4, 21, 30);
        LocalDateTime arvival3 = LocalDateTime.of(2019, 10, 4, 23, 30);
        Flight wroclaToBerlin1 = new Flight("wroclaw", "berlin", depature1, arvival1, "FL1001");
        Flight wroclaToBerlin2 = new Flight("wroclaw", "berlin", depature2, arvival2, "FL1002");
        Flight wroclaToBerlin3 = new Flight("wroclaw", "berlin", depature3, arvival3, "FL1003");
        Flight berlinToMadrid1 = new Flight("berlin", "madrid", depature1, arvival1, "FL1004");
        Flight berlinToMadrid2 = new Flight("berlin", "madrid", depature2, arvival2, "FL1005");
        Flight berlinToMadrid3 = new Flight("berlin", "madrid", depature3, arvival3, "FL1006");
        Flight wroclaToMadrid1 = new Flight("wroclaw", "madrid", depature1, arvival1, "FL1007");
        Flight wroclaToMadrid2 = new Flight("wroclaw", "madrid", depature2, arvival2, "FL1008");
        Flight wroclaToMadrid3 = new Flight("wroclaw", "madrid", depature3, arvival3, "FL1009");
        FlightDatabase flightDatabase = new FlightDatabase();
        flightDatabase.addFlightToDatabase(wroclaToBerlin1);
        flightDatabase.addFlightToDatabase(wroclaToBerlin2);
        flightDatabase.addFlightToDatabase(wroclaToBerlin3);
        flightDatabase.addFlightToDatabase(berlinToMadrid1);
        flightDatabase.addFlightToDatabase(berlinToMadrid2);
        flightDatabase.addFlightToDatabase(berlinToMadrid3);
        flightDatabase.addFlightToDatabase(wroclaToMadrid1);
        flightDatabase.addFlightToDatabase(wroclaToMadrid2);
        flightDatabase.addFlightToDatabase(wroclaToMadrid3);
        SerchRequest serchRequest = new SerchRequest("wroclaw", "madrid", LocalDateTime.of(2019, 10, 4, 11, 00));
        BookingService bookingService = new BookingService();
        BookRepository bookRepository = new BookRepository();
        FlightProcessor flightProcessor = new FlightProcessor(bookingService, bookRepository);

        String resultDatabase = flightProcessor.printResult(flightProcessor.serchFlight(serchRequest, flightDatabase.getFlightDatabase()));

        System.out.println(resultDatabase);
        List<String> flightToBook = new ArrayList<>();
        flightToBook.add("FL1001");
        flightToBook.add("FL1005");

        BookRequest bookRequest = new BookRequest("Albert", "Einstein", flightToBook);
        flightProcessor.processBooking(bookRequest);


    }

}
