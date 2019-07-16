package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ShapeCollector {
    public List<Shape> shapes;

    public ShapeCollector(){
        this.shapes = new ArrayList<Shape>();


    }

    public void addFigure(Shape shape){
        shapes.add(shape);

    }

    public void removeFigure(Shape shape){
        shapes.remove(shape);
    }

    public Shape getFigure(int n){
        if (n >= 0 && n <= shapes.size()){
            return shapes.get(n);
        }
        return null;
    }

    public String showFigures(){
        return shapes.toString();
    }


    public List<Shape> getShapeList() {
        Optional<List<Shape>> result = Optional.of(shapes);

        return result.get();
    }
}
