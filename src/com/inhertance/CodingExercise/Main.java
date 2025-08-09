package com.inhertance.CodingExercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an operation ot perform: \n 1 - Addition \n 2 - Subtraction \n 3 - Multiplication \n 4 - Division");
        int choice  = sc.nextInt();

        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();
        ArithmaticOperations operations;

        switch (choice){
            case 1: operations = new Addition();
                break;
            case 2: operations = new Subtraction();
                break;
            case 3: operations = new Multiplication();
                break;
            case 4: operations = new Division();
                break;
            default:
                System.out.println("Invalid Choice entered.");
                return;
        }
        double result = operations.calculate(num1,num2);
        System.out.println("Result is: "+ result);
    }
}
