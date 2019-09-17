package com.kodilla.good.patterns.challanges.food2door;

public interface OrderRepository {
    void createOrder(final String name,final String surname,final Integer cost);
}
