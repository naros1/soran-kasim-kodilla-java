package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaWithAllComponentsGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new BaconDecorator(theOrder);
        theOrder = new BbqSauceDecorator(theOrder);
        theOrder = new PeperoniDecorator(theOrder);
        theOrder = new SweetCornDecorator(theOrder);
        System.out.println("Pizza price is: " + theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(38), theCost);
    }

    @Test
    public void testPizzaWithAllComponentsGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new BaconDecorator(theOrder);
        theOrder = new BbqSauceDecorator(theOrder);
        theOrder = new PeperoniDecorator(theOrder);
        theOrder = new SweetCornDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String theDescription = theOrder.getDescription();
        //Then
        assertEquals("Pizza base : Botom, Tomato sauce, Cheese. Additional components : cheese, bacon, BBQ sauce, peperoni, sweetcorn,", theDescription);
    }

}