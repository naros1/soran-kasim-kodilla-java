package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    private List<Integer> odd;

    public OddNumbersExterminator(){
        this.odd = new ArrayList<Integer>();
    }

    public List exterminate(List<Integer> numbers){
        if(numbers != null) {
            for (Integer number : numbers) {
                if (number % 2 == 0) {
                    odd.add(number);
                }
            }
            return odd;
        }else {

            System.out.println("Klasa jest pusta !");

        }
        return odd;

    }


}
