package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        Calculator calculator = new Calculator(3,5);

        int resultAdd = calculator.getA() + calculator.getB();
        int resultSubtract = calculator.getA() - calculator.getB();

        if (calculator.add() == resultAdd && calculator.subtract() == resultSubtract){
            System.out.println("Test ok");
        } else {
            System.out.println("Error");
        }
    }
}
