package com.kodilla.good.patterns.challanges.orderingservice;

import javax.jws.soap.SOAPBinding;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class OrderRequestRetriver {
    public OrderRequest retrive(){

        User user = new User("John", "Rambo");
        Order order = new Order("Bow", 150.99);
        LocalDateTime orderDAndT = LocalDateTime.of(LocalDate.now(), LocalTime.now());

        return new OrderRequest(user, order, orderDAndT);
    }
}
