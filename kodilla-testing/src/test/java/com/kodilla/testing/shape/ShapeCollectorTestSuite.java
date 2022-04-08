package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

@DisplayName("TDD: Shape Collection Test Suite")
public class ShapeCollectorTestSuite {

    @Nested
    @DisplayName ("Test add and remove")
        class AddAndRemove {

        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Square("Name-Square", "Field 23m2"));
            shapeCollector.addFigure(new Circle("Name-Circle", "Field 51m2"));
            shapeCollector.addFigure(new Triangle("Name-Triangle", "Field 40m2"));

            //When
            shapeCollector.addFigure(new Square("Name-SmallSquare", "Field 8m2"));

            //Then
            Assertions.assertEquals(4,shapeCollector.getSize());
        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Square("Name-Square", "Field 23m2"));
            shapeCollector.addFigure(new Circle("Name-Circle", "Field 51m2"));
            shapeCollector.addFigure(new Triangle("Name-Triangle", "Field 40m2"));

            //When
            shapeCollector.removeFigure(new Square("Name-Square", "Field 23m2"));

            //Then
            Assertions.assertEquals(2,shapeCollector.getSize());
        }


    }

    @Nested
    @DisplayName ("Test get and show")
    class GetAndShow {

        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Square("Name-Square", "Field 23m2"));
            shapeCollector.addFigure(new Circle("Name-Circle", "Field 51m2"));
            shapeCollector.addFigure(new Triangle("Name-Triangle", "Field 40m2"));

            //When
            //Shape expectedShape = shapeCollector.shapes.get(0);
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(0);

            //Then
            Assertions.assertNotNull(retrievedShape);
            Assertions.assertEquals("Name-Square", retrievedShape.getShapeName());
        }
        @Test
        void testGetFigureLessThan0() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Square("Name-Square", "Field 23m2"));
            shapeCollector.addFigure(new Circle("Name-Circle", "Field 51m2"));
            shapeCollector.addFigure(new Triangle("Name-Triangle", "Field 40m2"));

            //When
            //Shape expectedShape = shapeCollector.shapes.get(0);
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(-1);

            //Then
            Assertions.assertNull(retrievedShape);
        }

        @Test
        void testGetFigureGreaterThanListSize() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Square("Name-Square", "Field 23m2"));
            shapeCollector.addFigure(new Circle("Name-Circle", "Field 51m2"));
            shapeCollector.addFigure(new Triangle("Name-Triangle", "Field 40m2"));

            //When
            //Shape expectedShape = shapeCollector.shapes.get(0);
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(5);

            //Then
            Assertions.assertNull(retrievedShape);
        }

        @Test
        void testShowFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Square("Square", "Field 23m2"));
            shapeCollector.addFigure(new Circle("Circle", "Field 51m2"));
            shapeCollector.addFigure(new Triangle("Triangle", "Field 40m2"));
            //When
            String actual = shapeCollector.showFigures();
            //Then
            Assertions.assertEquals("SquareCircleTriangle", actual);
        }                           //actual:SquareCircleTriangle

    }
}
