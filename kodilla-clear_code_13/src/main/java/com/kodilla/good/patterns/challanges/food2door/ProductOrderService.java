package com.kodilla.good.patterns.challanges.food2door;

public class ProductOrderService implements OrderService {
    public boolean order(OrderRequest orderRequest){
        System.out.println("Zamówił : " + orderRequest.getName() + " | " + orderRequest.getSurname() +
                "\n Produkty" + orderRequest.getOrderList());
        return true;
    }
}
