package com.kodilla.good.patterns.challanges.orderingservice;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private Order order;
    private LocalDateTime orderDateAndTime;

    public OrderRequest(final User user, final Order order, final LocalDateTime orderDAndT) {
        this.user = user;
        this.order = order;
        this.orderDateAndTime = orderDAndT;
    }

    public User getUser() {
        return user;
    }

    public Order getOrder() {
        return order;
    }

    public LocalDateTime getOrderDateAndTime() {
        return orderDateAndTime;
    }
}
