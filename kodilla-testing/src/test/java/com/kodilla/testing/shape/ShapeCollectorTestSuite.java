package com.kodilla.testing.shape;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.ShapeCollector;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

@DisplayName("TDD: ShapeCollector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {

        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {

        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector(new Triangle("Triangle", 40.5));
        Triangle newTriangle = new Triangle("Triangle", 40.5));
        Shape shape = (Shape) newTriangle;

        //When
        shapeCollector.addFigure((Shape) new Triangle("Triangle", 40.5));

        //Then
        Assertions.assertEquals(1, shapes.size());


    }

    @Test
    void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector(new Triangle("Triangle", 40.5));
        Triangle newTriangle = new Triangle("Triangle", 40.5));
        Shape shape = (Shape) newTriangle;
        shapeCollector.addFigure(shape.getShapeName(),shape.getField());

        //When
        boolean result = shapeCollector.removeFigure(shape);

        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(1, shapes.size());


    }

    @Test
    void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector(new Triangle("Triangle", 40.5));
        Triangle newTriangle = new Triangle("Triangle", 40.5));
        Shape shape = (Shape) newTriangle;
        shapeCollector.addFigure(shape.getShapeName(),shape.getField());

        //When
        Triangle retrievedTriangle;
        retrievedTriangle = shapeCollector.getFigure(0);

        //Then
        Assertions.assertEquals(newTriangle, retrievedTriangle);

    }

    @Test
    void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector(new Triangle("Triangle", 40.5));
        Triangle newTriangle = new Triangle("Triangle", 40.5));
        Shape shape = (Shape) newTriangle;
        shapeCollector.addFigure(shape.getShapeName(),shape.getField());

        //When
        boolean result = shapeCollector.showFigures(shape);

        //Then
        Assertions.assertTrue(result);

    }


}
