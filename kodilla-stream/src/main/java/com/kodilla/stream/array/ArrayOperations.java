package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers){
        int length = numbers.length;
       IntStream.range(0, length)
               .forEach(System.out::println);



        double average = IntStream.range(0, length)
                .map(n -> numbers[n])
                .average().orElse(-1);

        return average;

    }
}
