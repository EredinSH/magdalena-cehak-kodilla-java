package com.kodilla.testing.shapecalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeCalculatorTest {

    @Test
    public void testGetAreaSquare() {
        //GIVEN
        ShapeCalculator shapeCalculator = new ShapeCalculator();

        //WHEN
        double area = shapeCalculator.getArea(4, 4, ShapeType.SQUARE);

        //THEN
        Assertions.assertEquals(16, area);

    }

    @Test
    public void testGetAreaCircle() {
        //GIVEN
        ShapeCalculator shapeCalculator = new ShapeCalculator();

        //WHEN
        double area = shapeCalculator.getArea(1,0, ShapeType.CIRCLE);

        //THEN
        Assertions.assertEquals(Math.PI, area);

    }

}