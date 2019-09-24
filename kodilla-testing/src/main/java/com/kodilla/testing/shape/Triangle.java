package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public String getShapeName() {
        String shapeName = "Triangle";
        System.out.println(shapeName);
        return shapeName;
    }

    public double getField() {
        double field = 0.5 * a * h;
        System.out.println("The field of triangle is : " + field + " m2 ");
        return field;
    }
}

