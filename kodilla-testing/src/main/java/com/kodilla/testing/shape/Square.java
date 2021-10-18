package com.kodilla.testing.shape;

public class Square {
    double a;
    String figureName = "Square";
    double figureField;

    public String getShapeName() {
        return figureName;
    }

    public double getField() {
        figureField = a * a;
        return figureField;
    }

    public Square(String figureName, double figureField) {
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

        Square square = (Square) o;

        if (Double.compare(square.figureField, figureField) != 0) return false;
        return figureName.equals(square.figureName);
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
