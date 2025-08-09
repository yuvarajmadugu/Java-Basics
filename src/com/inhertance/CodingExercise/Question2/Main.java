package com.inhertance.CodingExercise.Question2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose shape to calculate Area\n 1 - Rectangle\n 2 - Circle\n 3 - Traingle");

        int choice = sc.nextInt();
        Shape shape;

        switch(choice){
            case 1:
                System.out.println("Enter Length: ");
                double length = sc.nextDouble();
                System.out.println("Enter Breadth: ");
                double breadth = sc.nextDouble();
                shape = new Rectangle(length, breadth);
                break;
            case 3:
                System.out.println("Enter base: ");
                double base = sc.nextDouble();
                System.out.println("Enter height: ");
                double height = sc.nextDouble();
                shape = new Rectangle(base, height);
                break;
            case 2:
                System.out.println("Enter radius: ");
                double radius = sc.nextDouble();
                shape = new Circle(radius);
                break;
            default :
                System.out.println("Invalid choice entered");
                return;
        }
        double area = shape.calculateArea();
        System.out.println("Area is "+area);
        sc.close();
    }
}
