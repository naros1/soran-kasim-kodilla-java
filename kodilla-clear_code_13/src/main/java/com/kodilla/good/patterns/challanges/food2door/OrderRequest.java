package com.kodilla.good.patterns.challanges.food2door;

import javax.jnlp.IntegrationService;
import java.util.HashMap;
import java.util.Map;

public class OrderRequest {
    private String name;
    private String surname;
    private String phonenumber;
    private HashMap<String, Integer> orderList = new HashMap<>();

    public OrderRequest(final String name,final String surname,final String phonenumber) {
        this.name = name;
        this.surname = surname;
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getOrderList() {
        return orderList.toString();
    }
    

    public void addOrderToList(String name, Integer count) {
        orderList.put(name,count);
    }

    public Integer getOrderCost(Supplier supplier) {
        Integer cost = 0 ;
        for (Map.Entry<String,Integer> entry: orderList.entrySet()
             ) {
            try {
                cost = cost + (supplier.getProductCost(entry.getKey()) * entry.getValue());
            }catch (Exception e1){
                System.out.println( "Wybrany sprzedawca nie oferuje w sprzedarzy produktu : " + entry.getKey());
            }
        }
        
        return cost;
    }
}
