package com.inhertance.CodingExercise.Question2;

public class Rectangle implements Shape{
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea(){
        return length*breadth;
    }

}
