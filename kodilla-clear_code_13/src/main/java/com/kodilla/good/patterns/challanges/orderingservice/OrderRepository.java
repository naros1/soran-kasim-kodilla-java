package com.kodilla.good.patterns.challanges.orderingservice;

import java.time.LocalDateTime;
import java.util.Map;

public interface OrderRepository {

    void createOrder(User user, Order order, LocalDateTime orderDAndT);

}
