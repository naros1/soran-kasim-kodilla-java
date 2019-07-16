package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {


    public OddNumbersExterminator(){

    }

    public List exterminate(List<Integer> numbers){
        List<Integer> odd = new ArrayList<Integer>();
        odd.clear();
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
