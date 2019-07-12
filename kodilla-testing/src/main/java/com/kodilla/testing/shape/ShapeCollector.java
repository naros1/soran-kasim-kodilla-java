package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    public ArrayList<Shape> shapeList = new ArrayList<Shape>();

    public ShapeCollector(){

    }

    public void addFigure(Shape shape){


    }

    public void removeFigure(Shape shape){


    }

    public Shape getFigure(int n){
        return shapeList.get(n);
    }

    public Object showFigures(){
        return shapeList.toArray();
    }
}
