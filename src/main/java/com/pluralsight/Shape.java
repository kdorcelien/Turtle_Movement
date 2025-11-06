package com.pluralsight;
import java.awt.*;

public abstract class Shape implements Paintable{
    protected Turtle turtle;
    protected Point location ;
    protected Color color;
    protected double borderWidth;

    public Shape(Turtle turtle, Point location, Color color, double borderWidth) {
        this.turtle = turtle;
        this.location = location;
        this.color = color;
        this.borderWidth = borderWidth;
    }


    @Override
    public abstract void paint();

    public Turtle getTurtle() {
        return turtle;
    }

    public void setTurtle(Turtle turtle) {
        this.turtle = turtle;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(double borderWidth) {
        this.borderWidth = borderWidth;
    }
}
