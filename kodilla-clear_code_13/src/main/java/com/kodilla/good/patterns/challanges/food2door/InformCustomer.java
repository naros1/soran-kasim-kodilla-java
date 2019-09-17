package com.kodilla.good.patterns.challanges.food2door;

public class InformCustomer implements InformationService{
    @Override
    public void inform(final String name) {
        System.out.println("Dziekujemy za złozenie zamówieni : " + name + "!!!" + "\n Serdecznie Pozdrawiamy !!!");
    }
}
