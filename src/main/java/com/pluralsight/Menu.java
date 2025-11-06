package com.pluralsight;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private World world;
    public final List<Shape> shapes = new ArrayList<>();

    public static final Scanner scan = new Scanner(System.in);


    public static void displayMenu() {
        System.out.println("1: Add Shape");
        System.out.println("2: Save Painting");
        System.out.println("3: Exit");
    }

    public void display() {
        boolean run = true;

        while (run) {
            displayMenu();

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1 -> addShape();
                case 2 -> savePainting();
                case 3 -> run = false;
            }
        }
    }

    private void addShape() {
        System.out.println("\nChoose shape type:");
        System.out.println("1) Square");
        System.out.println("2) Circle");
        System.out.println("3) Triangle");
        System.out.print("Shape: ");
        String type = scan.nextLine().trim();

        System.out.print("Enter X coordinate (0 = center): ");
        double x = Double.parseDouble(scan.nextLine().trim());

        System.out.print("Enter Y coordinate (0 = center): ");
        double y = Double.parseDouble(scan.nextLine().trim());

        System.out.print("Border width (pixels): ");
        double border = Double.parseDouble(scan.nextLine().trim());

        System.out.print("Color name (e.g. red, blue, green): ");
        Color color = parseColor(scan.nextLine().trim());

        switch (type) {
            case "1": // Square
                System.out.print("Enter side length (pixels): ");
                double side = Double.parseDouble(scan.nextLine().trim());
                Shape square = new Square(new Turtle(world, x, y), new Point((int)x, (int)y), color, border, side);
                square.paint();
                shapes.add(square);
                break;

            case "2": // Circle
                System.out.print("Enter radius (pixels): ");
                double radius = Double.parseDouble(scan.nextLine().trim());
                Shape circle = new Circle(new Turtle(world, x, y), new Point((int)x, (int)y), color, border, radius);
                circle.paint();
                shapes.add(circle);
                break;

            case "3": // Triangle
                System.out.print("Enter size length (pixels): ");
                double size = Double.parseDouble(scan.nextLine().trim());
                System.out.println("Enter height: ");
                double height = Double.parseDouble(scan.nextLine().trim());
                Shape triangle = new Triangle(new Turtle(world, x, y), new Point((int)x, (int)y), color, border, size, height);
                triangle.paint();
                shapes.add(triangle);
                break;

            default:
                System.out.println("Unknown shape.");
                break;
        }
    }

    public void savePainting() {
        System.out.println("Enter File Name");
        String filename = scan.nextLine().trim();
        world.saveAs(filename);
        System.out.println("Saved to" + filename);

    }

    private Color parseColor(String name) {
        String n = name.trim().toLowerCase();
        switch (n) {
            case "black":
                return Color.BLACK;
            case "blue":
                return Color.BLUE;
            case "red":
                return Color.RED;
            case "green":
                return Color.GREEN;
            case "yellow":
                return Color.YELLOW;
            case "orange":
                return Color.ORANGE;
            case "pink":
                return Color.PINK;
            case "magenta":
                return Color.MAGENTA;
            case "cyan":
                return Color.CYAN;
            case "gray":
            case "grey":
                return Color.GRAY;
            case "white":
                return Color.WHITE;
            case "darkgray":
                return Color.DARK_GRAY;
            default:
                try {
                    if (n.startsWith("#")) {
                        return Color.decode(n);
                    }
                } catch (NumberFormatException e) {
                    // ignore invalid hex
                }
                System.out.println("Unrecognized color, defaulting to black.");
                return Color.BLACK;
        }
    }
}