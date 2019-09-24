package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> list;

    public ShapeCollector() {
        list = new ArrayList<Shape>();
    }

    public void addFigure(Shape shape) {
        list.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if(list.contains(shape)) {
            list.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int figureNumber) {
        if (figureNumber>=0 && figureNumber < list.size()) {
          return list.get(figureNumber);
        }
        return null;
    }

    public int size() {
        return list.size();
    }
}
