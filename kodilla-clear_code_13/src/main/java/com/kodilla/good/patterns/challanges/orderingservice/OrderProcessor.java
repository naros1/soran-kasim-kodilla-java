package com.kodilla.good.patterns.challanges.orderingservice;

import java.time.LocalDateTime;

public class OrderProcessor {
    private InformationService informationService;
    private ProducOrderService producOrderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final ProducOrderService producOrderService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.producOrderService = producOrderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = producOrderService.order(orderRequest.getUser(), orderRequest.getOrder() ,
                orderRequest.getOrderDAndT());

        if(isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(),orderRequest.getOrder(),orderRequest.getOrderDAndT());
            return new OrderDto(orderRequest.getUser(),true);
        } else {
            return new OrderDto(orderRequest.getUser(),false);
        }

    }
}
