package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private Shape shape;
    public ArrayList<Shape> shapeList;

    public ShapeCollector(){
        this.shapeList = new ArrayList<Shape>();


    }

    public void addFigure(Shape shape){
        shapeList.add(shape);

    }

    public void removeFigure(Shape shape){
        shapeList.remove(shape);
    }

    public Shape getFigure(int n){
        if (n >= 0 && n <= shapeList.size()){
            return shapeList.get(n);
        }
        return null;
    }

    public String showFigures(){
        return shapeList.toString();
    }


    public ArrayList<Shape> getShapeList() {
        return shapeList;
    }
}
