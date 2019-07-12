package com.kodilla.testing.shape;

public class Circle extends ShapeCollector {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public String getShapeName(){
        return "Circle";
    }

    public Double getField(){

        return 3.14 * r * r;
    }
}
