package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test case: begin");
    }
    @After
    public void after(){
        System.out.println("Test case: end");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        List<Integer> numbers = new ArrayList<Integer>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        List result =  exterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(0, result.size() );
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        List<Integer> numbers = new ArrayList<Integer>();
        List<Integer> numbersresult = new ArrayList<Integer>();
        int k =0;
        for (int n = 0; n<10 ; n++){
             k = n*2;
            numbersresult.add(k);
        }
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        for (int n = 0; n<20 ; n++){
            numbers.add(n);
        }
        //When
        List result =  exterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(numbersresult, result );
    }


}
