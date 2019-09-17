package com.kodilla.good.patterns.challanges.food2door;


import java.util.HashMap;

public interface Supplier {

    OrderDto process(OrderRequest orderRequest);

    Integer getProductCost(String name);

    String getSupplierName();

    void addProductToList(String productName, Integer cost);

    String getListOfProducts();



}
