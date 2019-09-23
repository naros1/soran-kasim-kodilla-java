package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public final class Display {
    public void displayValye(double val){
        System.out.println("Wartość wyniku : " + val);
    }
}
