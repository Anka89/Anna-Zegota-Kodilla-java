package com.kodilla.testing.shape;

public class Square implements Shape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public String getShapeName() {
        String shapeName = "Square";
        System.out.println(shapeName);
        return shapeName;
    }

    public double getField() {
        double field = a * a;
        System.out.println("The field of square is : " + field + " m2 ");
        return field;
    }
}
