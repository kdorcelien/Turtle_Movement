package com.pluralsight;

import java.awt.*;

public class Square extends Shape {
    private int width;

    public Square(Turtle turtle, Point location, Color color, double borderWidth, int width) {
        super(turtle, location, color, borderWidth);
        this.width = width;
    }

    @Override
    public void paint() {

    }
}
