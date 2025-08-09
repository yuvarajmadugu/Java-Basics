package com.CodingExercises;

public class Book {
    private String title;
    private String author;
    double price;

    public Book(){
        this("unknown","unknown");
//        this.title = "Unknown";
//        this.author = "Unknown";
        this.price = 500.00;
        System.out.println("No argument constructor");
    }

    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("Parameterized 3 arguments");
    }

    public Book(String title, String author){
        this(title,author, 1000.00);
//        this.title = title;
//        this.author = author;
        System.out.println("Parameterized 2 argumuments");
    }

    public void displaydetails(){

    }
}
