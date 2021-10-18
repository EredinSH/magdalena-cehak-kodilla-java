package com.kodilla.testing.shape;

public class Circle {

    double pi = 3.14;
    double r;
    String figureName = "Circle";
    double figureField;

    public String getShapeName() {
        return figureName;
    }

    public double getField() {
        figureField = pi * r * r;
        return figureField;
    }

    public Circle(String figureName, double figureField) {
        this.figureName = figureName;
        this.figureField = figureField;
    }

    public String getFigureName() {
        return figureName;
    }

    public double getFigureField() {
        return figureField;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.figureField, figureField) != 0) return false;
        return figureName.equals(circle.figureName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = figureName.hashCode();
        temp = Double.doubleToLongBits(figureField);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
