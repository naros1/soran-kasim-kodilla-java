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
        List<Integer> ToExterminate = new ArrayList<Integer>();
        OddNumbersExterminator numbersToExterminate = new OddNumbersExterminator();
        //When
        List result =  numbersToExterminate.exterminate(ToExterminate);
        //Then
        Assert.assertEquals(0, result.size() );
    }





    List<Integer> numbersresult = new ArrayList<Integer>();
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        List<Integer> TestOddNumbersResult = new ArrayList<Integer>();
        TestOddNumbersResult.add(10);
        TestOddNumbersResult.add(22);
        TestOddNumbersResult.add(184);

        List<Integer> numbersToExterminate = new ArrayList<Integer>();
        numbersToExterminate.add(10);
        numbersToExterminate.add(22);
        numbersToExterminate.add(13);
        numbersToExterminate.add(15);
        numbersToExterminate.add(184);
        numbersToExterminate.add(17);
        numbersToExterminate.add(43);

        OddNumbersExterminator toExterminate = new OddNumbersExterminator();

        //When
        List result =  toExterminate.exterminate(numbersToExterminate);
        //Then
        Assert.assertEquals(TestOddNumbersResult, result );
    }

    @Test
    public void testOddNumbersExterminatorRepetedNormalList(){
        //Given
        List<Integer> TestOddNumbersResult = new ArrayList<Integer>();
        TestOddNumbersResult.add(10);
        TestOddNumbersResult.add(22);
        TestOddNumbersResult.add(184);

        List<Integer> numbersToExterminate = new ArrayList<Integer>();
        numbersToExterminate.add(10);
        numbersToExterminate.add(22);
        numbersToExterminate.add(13);
        numbersToExterminate.add(15);
        numbersToExterminate.add(184);
        numbersToExterminate.add(17);
        numbersToExterminate.add(43);

        OddNumbersExterminator toExterminate = new OddNumbersExterminator();

        //When
        toExterminate.exterminate(numbersToExterminate);
        toExterminate.exterminate(numbersToExterminate);
        toExterminate.exterminate(numbersToExterminate);
        List result = toExterminate.exterminate(numbersToExterminate);

        //Then
        Assert.assertEquals(TestOddNumbersResult, result );
    }


}
