package com.CodingExercises;

public class ProductTestDrive {
    public static void main(String[] args) {
        Product p1 = new Product("tshirt", "123j");
        p1.displayDetails();
        System.out.println("\n");

        Product p2 = new Product("Laptop", "fd0111", 58000.00, 4);
        p2.displayDetails();
    }
}
