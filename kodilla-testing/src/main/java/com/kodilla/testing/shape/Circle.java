package com.kodilla.testing.shape;

public class Circle implements Shape {

    private String shapeName;
    private String field;

    public Circle(String shapeName, String field) {
        this.shapeName = shapeName;
        this.field = field;
    }

    public String getShapeName() {
        return shapeName;
    }

    public String getField() {
        return field;
    }
}
