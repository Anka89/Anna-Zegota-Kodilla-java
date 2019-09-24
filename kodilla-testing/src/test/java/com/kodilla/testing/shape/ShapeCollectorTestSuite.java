package com.kodilla.testing.shape;

import org.junit.*;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Triangle;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.ShapeCollector;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure () {
        Shape circle = new Circle(5);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        assertEquals(1, shapeCollector.size());
    }
    @Test
    public void testRemoveFigure () {

        Shape triangle = new Triangle(3, 4);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(triangle);
        boolean result = shapeCollector.removeFigure(triangle);
        assertTrue(result);
        assertEquals(0,shapeCollector.size());
    }

    @Test
    public void testGetFigure() {
        Shape triangle = new Triangle(3, 4);
        triangle.getShapeName();
        triangle.getField();
        Shape circle =  new Circle(5);
        Shape circle1 = new Circle(5);
        circle.getShapeName();
        circle.getField();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        assertEquals(circle1, shapeCollector.getFigure(1));
    }
}
