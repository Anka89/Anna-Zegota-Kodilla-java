package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.r, r) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r);
    }

    @Override


    public String getShapeName() {
        String shapeName = "Circle";
        System.out.println(shapeName);
        return shapeName;
    }

    public double getField() {
        double field = 3.14 * r * r;
        System.out.println("The field of circle is : " + field + " m2 ");
        return field;
    }
}