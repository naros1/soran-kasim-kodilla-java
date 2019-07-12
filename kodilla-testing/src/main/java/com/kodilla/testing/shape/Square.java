package com.kodilla.testing.shape;

public class Square extends ShapeCollector {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public String getShapeName(){
        return "Square";
    }

    public Double getField(){

        return a*a;
    }
}
