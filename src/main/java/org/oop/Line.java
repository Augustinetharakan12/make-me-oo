package org.oop;

public class Line {
    Point from;
    Point to;

    public Line(Point from, Point to) {
        this.from = from;
        this.to = to;
    }

    public double distance() {
        double yDistance = this.to.getY() - this.from.getY();
        double xDistance = this.to.getX() - this.from.getX();
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public double direction() {
        double xDistance = this.to.getX() - this.from.getX();
        double yDistance = this.to.getY() - this.from.getY();
        return Math.atan2(yDistance, xDistance);
    }
}
