package com.kodilla.good.patterns.challanges.food2door;

import java.util.HashMap;

public class Application {
    public static void main(String[] args) {
        ProductOrderService productOrderService = new ProductOrderService();
        InformCustomer informCustomer = new InformCustomer();
        ProducOtderRepository producOtderRepository = new ProducOtderRepository();
        SupplierExtraFoodShop supplierExtraFoodShop = new SupplierExtraFoodShop("Extra Food Shop", productOrderService, informCustomer,producOtderRepository);
        supplierExtraFoodShop.addProductToList("jablka", 5);
        supplierExtraFoodShop.addProductToList("kokos", 20);

        HashMap<String, Integer> orderList = new HashMap<>();
        OrderRequest orderRequest = new OrderRequest("Soran", "Kasim", "123456789");
        orderRequest.addOrderToList("jablka", 5);
        orderRequest.addOrderToList("kokos", 2);
        supplierExtraFoodShop.process(orderRequest);

    }
}
