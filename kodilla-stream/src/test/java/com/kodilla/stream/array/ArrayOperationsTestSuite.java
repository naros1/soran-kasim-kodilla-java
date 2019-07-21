package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite implements ArrayOperations {
    @Test
    public void testGetAverage() {
        //Given
        int numbers[] = new int[20];
        for (int i = 0; i < 20 ; i++) {
            numbers[i] = i ;
        }
        int sum = 0;
        for (int i = 0; i < 20 ; i++){
            sum = sum + numbers[i];
        }

        double averageByAssertCalculated = (double) sum/ (double) numbers.length;

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then

        Assert.assertEquals(averageByAssertCalculated, average, 0.001);
    }
}
