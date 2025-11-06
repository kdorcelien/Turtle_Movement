package com.pluralsight;

import java.awt.*;

public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(Turtle turtle, Point location, Color color, double borderWidth, double base, double height) {
        super(turtle, location, color, borderWidth);
        this.base = base;
        this.height = height;
    }

    @Override
    public void paint() {

    }
}
