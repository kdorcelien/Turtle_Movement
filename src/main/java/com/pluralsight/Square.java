package com.pluralsight;

import java.awt.*;

public class Square extends Shape {
    private double size;

    public Square(Turtle turtle, Point location, Color color, double borderWidth, double size) {
        super(turtle, location, color, borderWidth);
        this.size = size;
    }

    @Override
    public void paint() {
        double half = size/2.0;
        double startX = location.x - half;
        double startY = location.y - half;

        turtle.penUp();
        turtle.setPenWidth(borderWidth);
        turtle.setColor(color);
        turtle.goTo(startX, startY);
        turtle.setHeading(0);
        turtle.penDown();

        double turnAngle = 90.0;

        for (double i = 0; i < 4; i++){
            turtle.forward(size);
            turtle.turnRight(turnAngle);
        }
        turtle.penUp();

    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
