package com.kodilla.testing.shape;

public class Triangle extends ShapeCollector {
    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public String getShapeName(){
        return "Triangle";
    }

    public Double getField(){
        return a*h/2;
    }

}
