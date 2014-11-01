package com.epam;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    private Rectangle rectangle;

    @Test(expected = RuntimeException.class)
    public void testPerimeterWhenBothSidesZeroThrowsException() {
        rectangle = new Rectangle(0, 0);
        rectangle.getPerimeter();
    }

    @Test(expected = RuntimeException.class)
    public void testPerimeterWhenOneOfSidesZeroThrowsException() {
        rectangle = new Rectangle(0, 100);
        rectangle.getPerimeter();
    }

    @Test(expected = RuntimeException.class)
    public void testGetPerimeterWhenOneOfSidesNegativeThrowsException() {
        rectangle = new Rectangle(-100, 100);
        rectangle.getPerimeter();
    }

    @Test
    public void testGetPerimeterOfNormalRectangle() {
        rectangle = new Rectangle(300, 100);
        int actualPerimeter = rectangle.getPerimeter();
        int expectedPerimeter = 800;
        assertEquals("Perimeter of empty rectangle calculate wrong",actualPerimeter, expectedPerimeter);
    }

    @Test
    public void testGetDiagonalOfNormalRectangle() {
        rectangle = new Rectangle(3, 2);
        double actualPerimeter = rectangle.getDiagonal();
        double expectedPerimeter = 3.6;
        assertEquals("Perimeter of empty rectangle calculate wrong",actualPerimeter, expectedPerimeter,0.01);
    }

    @Test
    public void testGetDiagonalOfRectangle() {
        rectangle = new Rectangle(3, 4);
        double actualPerimeter = rectangle.getDiagonal();
        double expectedPerimeter = 5;
        assertEquals("Rectangle's diagonal calculate wrong",actualPerimeter, expectedPerimeter,0.01);
    }

    @Test(expected = RuntimeException.class)
    public void testGetDiagonalWhenOneOfSidesNegativeThrowsException() {
        rectangle = new Rectangle(-100, 100);
        rectangle.getDiagonal();
    }
}