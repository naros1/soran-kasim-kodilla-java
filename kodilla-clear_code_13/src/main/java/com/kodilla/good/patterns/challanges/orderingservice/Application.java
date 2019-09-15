package com.kodilla.good.patterns.challanges.orderingservice;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retrive();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(),
                new ProducOrderService(), new OnlineShopRepository());
        orderProcessor.process(orderRequest);
    }
}
