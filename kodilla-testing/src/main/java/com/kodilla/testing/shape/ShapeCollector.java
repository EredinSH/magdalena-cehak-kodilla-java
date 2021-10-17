package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    String figureName;
    double field;
    private ArrayList<Circle> circles = new ArrayList<>();
    private ArrayList<Square> squares = new ArrayList<>();
    private ArrayList<Triangle> triangles = new ArrayList<>();

    public ShapeCollector(String figureName, double field) {
        this.figureName = figureName;
        this.field = field;
    }

    public String getShapeName(String figureName) {
        return figureName;
    }

    public double getField(double field) {
        return field;
    }


    public void addFigure(Shape shape) {

    }

    public void removeFigure(Shape shape) {

    }

    public void getFigure(int n) {

    }

    public void showFigures() {

    }

}
