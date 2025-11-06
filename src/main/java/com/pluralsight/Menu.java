package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private World world;
    public final List<Shape> shapes = new ArrayList<>();

    public static final Scanner scan = new Scanner(System.in);





    public static void displayMenu(){
        System.out.println("1: Add Shape");
        System.out.println("2: Save Painting");
        System.out.println("3: Exit");
    }
    public void display() {
        boolean run = true;

        while(run){
            displayMenu();

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1 -> addShape();
                case 2 -> savePainting();
                case 3 -> run = false;
                System.out.println("Goodbye!");
            }
        }
    }

    public List<Shape> addShapes() {
        System.out.println("Which Shape would you like to add" +
                "1: Triangle" +
                "2: Square" +
                "3: Circle");

        int choice = scan.nextInt();
        scan.nextLine();
        if (choice == 1){
            System.out.println("enter height: ");
            int height = scan.nextInt();
            scan.nextLine();

            Triangle triangle = new Triangle(height,
        }
        return shapes;
    }
}
