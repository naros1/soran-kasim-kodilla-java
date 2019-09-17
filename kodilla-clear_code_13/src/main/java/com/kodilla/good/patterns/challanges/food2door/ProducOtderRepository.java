package com.kodilla.good.patterns.challanges.food2door;

import java.util.HashMap;

public class ProducOtderRepository implements OrderRepository{
    private HashMap<String, Integer> orderList = new HashMap<>();
    @Override
    public void createOrder(String name, String surname, Integer cost) {
        String person = name + " " + surname;
        orderList.put(person,cost);
        System.out.println("Dodano nowe zamówienie do list : " + person + " | Kwota zamówienia : " + cost + " PLN");
    }
}
