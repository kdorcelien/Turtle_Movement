package com.pluralsight;

import java.awt.*;

public class Triangle extends Shape{
    private double size;
    private double height;

    public Triangle(Turtle turtle, Point location, Color color, double borderWidth,double size, double height) {
        super(turtle, location, color, borderWidth);
        this.size = size;
        this.height = height;
    }

    @Override
    public void paint() {
        double height = (Math.sqrt(3)/2.0)*size;
        double startX = location.x ;
        double startY = location.y ;

        turtle.penUp();
        turtle.setPenWidth(borderWidth);
        turtle.setColor(color);
        turtle.goTo(startX, startY);
        turtle.setHeading(0);
        turtle.penDown();

        double turnAngle = 120.0;

        for (double i = 0; i < 3; i++){
            turtle.forward(height);
            turtle.turnRight(turnAngle);
        }
        turtle.penUp();
    }

    public double getHeight() {
        return height;
    }

    public double getSize() {
        return size;
    }
}
