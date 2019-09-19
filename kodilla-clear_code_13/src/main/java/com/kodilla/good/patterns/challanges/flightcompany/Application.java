package com.kodilla.good.patterns.challanges.flightcompany;


import java.time.LocalDateTime;
import java.time.LocalTime;

public class Application {
    public static void main(String[] args) {
        Flight wroclaToBerlin = new Flight("wroclaw","berlin", LocalTime.of(4,15));
        Flight berlinToMadrid = new Flight("berlin","madrid",LocalTime.of(4,30));
        Flight wroclaToMadrid = new Flight("wroclaw","madrid",LocalTime.of(8,0));
        LocalDateTime depature1 = LocalDateTime.of(2019,10,4,12,30);
        LocalDateTime depature2 = LocalDateTime.of(2019,10,4,17,30);
        LocalDateTime depature3 = LocalDateTime.of(2019,10,4,11,30);


    }

}
