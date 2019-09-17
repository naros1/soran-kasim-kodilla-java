package com.kodilla.good.patterns.challanges.food2door;

import java.util.HashMap;

public class SupplierHealthyShop implements Supplier {
    private String name;
    private HashMap<String,Integer> listOfProducts = new HashMap<>();
    private OrderService orderService;
    private InformationService informationService;
    private OrderRepository orderRepository;

    public SupplierHealthyShop(final String name,final OrderService orderService,final InformationService informationService,final OrderRepository orderRepository) {
        this.name = name;
        this.orderService = orderService;
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }

    public String getListOfProducts() {
        return listOfProducts.toString();
    }

    @Override
    public OrderDto process(OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest);

        if(isOrdered) {
            informationService.inform(orderRequest.getName());
            orderRepository.createOrder(orderRequest.getName(),orderRequest.getSurname(),orderRequest.getOrderCost(this));
            System.out.println("Zamówiono w sklepie Healthy Shop !!!");
            return new OrderDto(orderRequest.getName(),orderRequest.getSurname(),true);
        } else {
            return new OrderDto(orderRequest.getName(),orderRequest.getSurname(),false);
        }
    }

    @Override
    public Integer getProductCost(String name) {
        return listOfProducts.get(name);

    }

    @Override
    public String getSupplierName() {
        return name;
    }

    @Override
    public void addProductToList(String productName, Integer cost) {
        listOfProducts.put(productName,cost);
    }

}
