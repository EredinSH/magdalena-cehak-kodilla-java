package com.kodilla.testing.shape;
import java.util.ArrayList;

public class ShapeCollector {

    Shape shape;

    private ArrayList<Shape> shapes = new ArrayList<>();

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public void showFigures() {
        for (Shape figures : this.shapes) {
            figures.toString();
        }
    }

}
