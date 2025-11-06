package com.pluralsight;

import java.awt.*;

public class Circle extends Shape {
    private double radius;
    private int segments = 48;

    public Circle(Turtle turtle, Point location, Color color, double borderWidth, double radius) {
        super(turtle, location, color, borderWidth);
        this.radius = radius;
    }

    @Override
    public void paint() {
        double startX = location.x + radius;
        double startY = location.y;

        turtle.penUp();
        turtle.setPenWidth(borderWidth);
        turtle.setColor(color);
        turtle.goTo(startX, startY);
        turtle.setHeading(0);
        turtle.penDown();

        double circumference = 2 * Math.PI * radius;
        double stepLength = circumference/segments;
        double turnAngle = 360.0/segments;

        for (int i = 0; i < segments; i++){
            turtle.forward(stepLength);
            turtle.turnRight(turnAngle);
        }
        turtle.penUp();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getSegments() {
        return segments;
    }

    public void setSegments(int segments) {
        this.segments = segments;
    }
}
