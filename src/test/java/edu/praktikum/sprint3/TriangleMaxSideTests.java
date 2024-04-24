package edu.praktikum.sprint3;

import org.junit.Assert;
import org.junit.Test;

public class TriangleMaxSideTests {

    @Test
    public void maxSideTest() {
        Triangle triangle = new Triangle(2, 10, 9);

        Assert.assertEquals("Максимальная сторона треугольника найдена неверно",
                10, triangle.maxSide());
    }
}
