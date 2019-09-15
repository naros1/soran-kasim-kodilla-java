package com.kodilla.good.patterns.challanges.orderingservice;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ProducOrderService
{
    public boolean order(final User user, final Order order, final LocalDateTime orderDate){
        System.out.println("Ordered for : " + user.getName() +" | "+ user.getSuranme()+"\n"
                + "Product : "+ order.getOrderName() + "\n" + "Cost : " + order.getCost() + "$$" +"\n"
                + "Zamówienie złożono : " + orderDate.toString());
        return true;
    }
}
