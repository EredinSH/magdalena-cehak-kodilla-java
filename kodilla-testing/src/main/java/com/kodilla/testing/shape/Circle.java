package com.kodilla.testing.shape;

public class Circle {

    double pi = 3.14;
    double r;
    String figureName = "Circle";
    double field;

    public double circleField(double pi, double r) {
        field = pi * r * r;
        return field;
    }

    public Circle(double pi, double r) {
        this.pi = pi;
        this.r = r;
    }

    public String getFigureName() {
        return figureName;
    }

    public double getField() {
        return field;
    }

    public double getR() {
        return r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.pi, pi) != 0) return false;
        return Double.compare(circle.r, r) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(pi);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(r);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
