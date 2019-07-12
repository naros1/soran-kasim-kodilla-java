package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        int toA = 5;
        int toB = 3;
        int resultAdd =  toA + toB;
        int resultSubtract = toA -toB;

        if(calculator.add(toA,toB) == resultAdd && calculator.subtract(toA, toB) == resultSubtract){
            System.out.println("Test Ok");
        }else {
            System.out.println("Error");
        }

    }
}
