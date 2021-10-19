package com.kodilla.testing.shape;
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

    @Nested
    @DisplayName("Testy dodające figury")
    class testAdd {
        @Test
        void testAddFigure() {
            //Given
            ArrayList<Shape> shapes = new ArrayList<>();
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle newTriangle = new Triangle("Triangle", 40.5);

            //When
            shapeCollector.addFigure(newTriangle);

            //Then
            Assertions.assertEquals(1, shapeCollector.getShapes().size());


        }
    }

    @Nested
    @DisplayName("Testy usuwające figury figury")
    class testRemove {
        @Test
        void testRemoveFigure() {
            //Given
            ArrayList<Shape> shapes = new ArrayList<>();
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle newTriangle = new Triangle("Triangle", 40.5);
            shapeCollector.addFigure(newTriangle);

            //When
            boolean result = shapeCollector.removeFigure(newTriangle);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapes.size());


        }
    }

    @Nested
    @DisplayName("Testy pobierające figury z kolekcji")
    class testGet {
        @Test
        void testGetFigure() {
            //Given
            ArrayList<Shape> shapes = new ArrayList<>();
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle newTriangle = new Triangle("Triangle", 40.5);
            shapeCollector.addFigure(newTriangle);

            //When
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(newTriangle, retrievedShape);

        }
    }


}
