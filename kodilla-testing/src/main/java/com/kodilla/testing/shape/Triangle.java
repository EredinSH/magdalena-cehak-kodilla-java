package com.kodilla.testing.shape;

public class Triangle {

    double tA;
    double h;
    String figureName = "Triangle";
    double field;

    public <h, tA> double triangleField(double tA, double h) {
        field = (tA/2) * h;
        return field;
    }

    public Triangle(double tA, double h) {
        this.tA = tA;
        this.h = h;
    }

    public String getFigureName() {
        return figureName;
    }

    public double getField() {
        return field;
    }

    public double gettA() {
        return tA;
    }

    public double getH() {
        return h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.tA, tA) != 0) return false;
        return Double.compare(triangle.h, h) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(tA);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(h);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
