package com.kodilla.testing.shape;

public class Square {
    double a;
    String figureName = "Square";
    double field;

    public double squareField(double a) {
        field = a * a;
        return field;
    }

    public Square(double a) {
        this.a = a;
    }

    public String getFigureName() {
        return figureName;
    }

    public double getField() {
        return field;
    }

    public double getA() {
        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return Double.compare(square.a, a) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(a);
        return (int) (temp ^ (temp >>> 32));
    }
}
