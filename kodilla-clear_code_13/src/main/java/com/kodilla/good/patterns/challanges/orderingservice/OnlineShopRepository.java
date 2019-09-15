package com.kodilla.good.patterns.challanges.orderingservice;

import java.time.LocalDateTime;

public class OnlineShopRepository extends OrderRepository {
    public void createOrder(User user, Order order, LocalDateTime orderDAndT) {
        System.out.println("Utworzono zamówienie : " + "\n" + " Ordered for : " + user.getName() +" | "+ user.getSuranme()+"\n"
                + " Product : "+ order.getOrderName() + "\n" + " Cost : " + order.getCost() + "$$" +"\n"
                + " Zamówienie złożono : " + orderDAndT.toString());
    }
}
