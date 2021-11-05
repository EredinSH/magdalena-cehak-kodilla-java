package com.kodilla.testing.shapecalculator;

public class ShapeCalculator {

    public double getArea(int x, int y, ShapeType shapeType) {
        if(shapeType == ShapeType.SQUARE) {
            return x*y;
        } else if(shapeType == ShapeType.CIRCLE) {
            return Math.PI*x*x;
        }
        return 0;
    }

}
