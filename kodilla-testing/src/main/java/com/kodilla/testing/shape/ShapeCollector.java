package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {


    private List<Shape> shapes = new ArrayList<>();

    public int getSize() {
        return shapes.size();
    }

    public ShapeCollector() {
    }

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
        /*if (shapes.contains(shape)) {
          shapes.remove(shape);
        }*/
    }

    public Shape getFigure(int n) {
        if (n<0 || n> shapes.size()) {
            return null;
        } else {
            return shapes.get(n);
        }
    }

    public String showFigures() {
        String result = "";
        for( Shape shape: shapes) {
            result += shape.getShapeName();
        }
        System.out.println(result);
        return result;
    }
}
