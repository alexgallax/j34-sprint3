package edu.praktikum.sprint3;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TrianglePerimeterTests {

    @Parameter
    public int side1;
    @Parameter(1)
    public int side2;
    @Parameter(2)
    public int side3;

    @Parameter(3)
    public int result;

    @Parameters(name = "{index} Периметр треугольника со сторонами {0}, {1}, {2} равен {3}")
    public static Object[][] data() {
        return new Object[][] {
                { 2, 3, 5, 10 },
                { 3, 8, 12, 23 }
        };
    }

    @Test
    public void perimeterTest() {
        Triangle triangle = new Triangle(side1, side2, side3);

        Assert.assertEquals("Периметр треугольника неверный",
                result, triangle.perimeter());
    }
}
