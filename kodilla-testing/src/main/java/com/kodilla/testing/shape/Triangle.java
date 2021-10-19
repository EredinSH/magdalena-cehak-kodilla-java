package com.kodilla.testing.shape;

public class Triangle implements Shape {

    double tA;
    double h;
    String figureName = "Triangle";
    double figureField;

    public String getShapeName() {
        return figureName;
    }

    public double getField() {
        figureField = (tA /2) * h;
        return figureField;
    }

    public Triangle(String figureName, double figureField) {
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

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.figureField, figureField) != 0) return false;
        return figureName.equals(triangle.figureName);
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
