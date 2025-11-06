package com.pluralsight;

import java.awt.*;

public class Circle extends Shape {
    private double radius;

    public Circle(Turtle turtle, Point location, Color color, double borderWidth, double radius) {
        super(turtle, location, color, borderWidth);
        this.radius = radius;
    }

    @Override
    public void paint() {
        System.out.println("ysouyyyv");
    }
}
