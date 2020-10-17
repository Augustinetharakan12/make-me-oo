package org.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LineTest {

    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Point origin = new Point(0, 0);
        Line line = new Line(origin, origin);

        Assertions.assertEquals(0, line.distance());
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(0, 1);
        Line line1 = new Line(origin, point1);
        Line line2 = new Line(origin, point2);

        Assertions.assertEquals(1, line1.distance());
        Assertions.assertEquals(1, line2.distance());
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(-1, 0);
        Line line = new Line(point1, point2);

        Assertions.assertEquals(2, line.distance());
    }

    @Test
    void originAndPointOnPostiveXAxisShouldBeZeroRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(3, 0);
        Line line1 = new Line(origin, point1);
        Line line2 = new Line(origin, point2);

        Assertions.assertEquals(0, line1.direction());
        Assertions.assertEquals(0, line2.direction());
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(-1, 0);
        Point point2 = new Point(-3, 0);
        Line line1 = new Line(origin, point1);
        Line line2 = new Line(origin, point2);

        Assertions.assertEquals(Math.PI, line1.direction());
        Assertions.assertEquals(Math.PI, line2.direction());
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(0, 1);
        Point point2 = new Point(0, 3);
        Line line1 = new Line(origin, point2);
        Line line2 = new Line(origin, point1);

        Assertions.assertEquals(Math.PI / 2, line1.direction());
        Assertions.assertEquals(Math.PI / 2, line2.direction());
    }
}
