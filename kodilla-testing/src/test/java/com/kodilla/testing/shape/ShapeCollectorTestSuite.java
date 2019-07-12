package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
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
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }


    @Test
    public void testAddShapeCollector() {
        //Given
        ShapeCollector shapes = new ShapeCollector();
        shapes.addFigure((Shape) new Circle(5.4));
        //When
        shapes.addFigure((Shape) new Circle(5.4));
        //Then
        Assert.assertEquals(1,shapes.shapeList.size());
    }

}
