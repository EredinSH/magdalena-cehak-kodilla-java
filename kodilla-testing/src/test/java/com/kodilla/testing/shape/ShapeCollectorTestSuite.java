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
        ShapeCollector shapeCollector = new ShapeCollector("Triangle", 40.5);
        Shape shape = (Shape) shapeCollector;

        //When
        shapeCollector.addFigure("Triangle", 40.5);

        //Then
        Assertions.assertEquals("Triangle", shape.getShapeName());


    }

    @Test
    void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector("Triangle", 40.5);
        Shape shape = (Shape) shapeCollector;
        shapeCollector.addFigure("Triangle", 40.5);

        //When
        boolean result = shapeCollector.removeFigure();

        //Then
        Assertions.assertFalse(result);


    }

    @Test
    void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector("Triangle", 40.5);
        Shape shape = (Shape) shapeCollector;
        Triangle triangle = new Triangle(81,1);
        shapeCollector.addFigure("Triangle", 40.5);
        triangle.getFigureName();

        //When
        Triangle retrievedTriangle = shapeCollector.getFigure(2);

        //Then
        Assertions.assertEquals(triangle, retrievedTriangle);


    }

    @Test
    void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        ArrayList<Triangle> triangles = new ArrayList<>();
        triangles.add();
        triangles.add();
        triangles.add();
        triangles.add();
        triangles.add();
        triangles.add();

        //When
        for (Triangle triangleList : triangles) {
            triangleList.toString();
        }

        boolean resultList = shapeCollector.showFigures(triangles);

        //Then
        Assertions.assertTrue(resultList);

    }


}
