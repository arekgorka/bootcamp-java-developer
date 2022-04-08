package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String shapeName;
    private String field;

    public Triangle(String shapeName, String field) {
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
