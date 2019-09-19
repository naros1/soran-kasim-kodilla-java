package com.kodilla.good.patterns.challanges.orderingservice;

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
                orderRequest.getOrderDateAndTime());

        if(isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(),orderRequest.getOrder(),orderRequest.getOrderDateAndTime());
            return new OrderDto(orderRequest.getUser(),true);
        } else {
            return new OrderDto(orderRequest.getUser(),false);
        }

    }
}
