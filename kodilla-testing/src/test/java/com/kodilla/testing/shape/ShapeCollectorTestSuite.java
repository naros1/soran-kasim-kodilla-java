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
        Shape circle = new Circle(5.4);
        ShapeCollector shapes = new ShapeCollector();
        //When
        shapes.addFigure( circle);
        //Then
        Assert.assertEquals(1,shapes.getShapeList().size());
    }
    @Test
    public void testRemoveShapeCollector() {
        //Given
        Shape circle = new Circle(5.4);
        ShapeCollector shapes = new ShapeCollector();
        shapes.addFigure( circle);
        //When
        shapes.removeFigure(circle);
        //Then
        Assert.assertEquals(0,shapes.getShapeList().size());
    }
    @Test
    public void testGetFigureShapeCollector() {
        //Given
        Shape circle = new Circle(5.4);
        ShapeCollector shapes = new ShapeCollector();
        shapes.addFigure( circle);
        //When
        Shape retrivedShape = shapes.getFigure(0);
        //Then
        Assert.assertEquals(shapes.shapeList.get(0),retrivedShape);
    }
    @Test
    public void testGetFieldShapeCollectorCircle() {
        //Given
        Shape circle = new Circle(5.4);
        ShapeCollector shapes = new ShapeCollector();
        shapes.addFigure( circle);
        double expect = 5.4*5.4*3.14;
        //When
        double retrivedShape = shapes.getFigure(0).getField();

        //Then
        Assert.assertEquals(expect,retrivedShape,0.000001);
    }
    @Test
    public void testGetNameShapeCollectorCircle() {
        //Given
        Shape circle = new Circle(5.4);
        ShapeCollector shapes = new ShapeCollector();
        shapes.addFigure( circle);
        String expect = "Circle" ;
        //When
        String retrivedShape = shapes.getFigure(0).getShapeName();

        //Then
        Assert.assertEquals(expect,retrivedShape);
    }
    @Test
    public void testGetFieldShapeCollectorTriangle() {
        //Given
        Shape triangle = new Triangle(5.4,3.2);
        ShapeCollector shapes = new ShapeCollector();
        shapes.addFigure( triangle);
        double expect = 5.4*3.2/2.0;
        //When
        double retrivedShape = shapes.getFigure(0).getField();

        //Then
        Assert.assertEquals(expect,retrivedShape,0.000001);
    }
    @Test
    public void testGetNameShapeCollectorTriangle() {
        //Given
        Shape triangle = new Triangle(5.4,3.2);
        ShapeCollector shapes = new ShapeCollector();
        shapes.addFigure( triangle);
        String expect = "Triangle" ;
        //When
        String retrivedShape = shapes.getFigure(0).getShapeName();

        //Then
        Assert.assertEquals(expect,retrivedShape);
    }
    @Test
    public void testGetFieldShapeCollectorSquare() {
        //Given
        Shape square = new Square(5.4);
        ShapeCollector shapes = new ShapeCollector();
        shapes.addFigure( square);
        double expect = 5.4*5.4;
        //When
        double retrivedShape = shapes.getFigure(0).getField();

        //Then
        Assert.assertEquals(expect,retrivedShape,0.000001);
    }
    @Test
    public void testGetNameShapeCollectorSquare() {
        //Given
        Shape square = new Square(5.4) {
        };
        ShapeCollector shapes = new ShapeCollector();
        shapes.addFigure( square);
        String expect = "Square" ;
        //When
        String retrivedShape = shapes.getFigure(0).getShapeName();

        //Then
        Assert.assertEquals(expect,retrivedShape);
    }
    @Test
    public void testGetShowShapeCollector() {
        //Given
        Shape square = new Square(5.4) {
        };
        ShapeCollector shapes = new ShapeCollector();
        shapes.addFigure( square);
        String expect = shapes.getShapeList().toString() ;
        //When
        String retrivedShape = shapes.showFigures();

        //Then
        Assert.assertEquals(expect,retrivedShape);
    }






}
