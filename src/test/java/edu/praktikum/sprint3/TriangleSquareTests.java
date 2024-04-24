package edu.praktikum.sprint3;

import org.junit.Assert;
import org.junit.Test;

public class TriangleSquareTests {

    @Test
    public void squareTest() {
        Triangle triangle = new Triangle(2, 5, 4);

        Assert.assertEquals("Площадь треугольника неверна",
                4, triangle.square());
    }
}
