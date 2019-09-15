package com.kodilla.good.patterns.challanges.orderingservice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Map;

public class Order {
    private String orderName;
    private Double cost;

    public Order(String orderName, Double cost) {
        this.orderName = orderName;
        this.cost = cost;
    }

    public String getOrderName() {
        return orderName;
    }

    public Double getCost() {
        return cost;
    }
}
