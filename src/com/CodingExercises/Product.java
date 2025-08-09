package com.CodingExercises;

public class Product {
    private String name;
    private String id;
    double price;
    int discount;

    //constructor 1
    public Product(){
        this("unknown","unknown",0.0,0);
        System.out.println("No arguments");
    }

    //constructor 2
    public Product(String name, String id){
        this(name, id, 1000.78, 10);
        System.out.println("Parameterized 2 argument");
    }

    //constructor 3
    public Product(String name, String id, double price, int discount){
        this.name = name;
        this.id = id;
        this.price = price;
        this.discount = discount;
        System.out.println("Parameterized 4 argument");
    }

    public double calculateDiscount(){
        return price - (price * discount/100);
    }

    public void displayDetails(){
        System.out.println("Product Name: "+this.name);
        System.out.println("Product Id: "+this.id);
        System.out.println("Product price: "+this.price);
        System.out.println("Discount: "+this.discount+"%");
        System.out.println("Price after discount: "+this.calculateDiscount());
    }
}
