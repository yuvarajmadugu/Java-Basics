package com.inhertance.CodingExercise.Question2;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI*radius*radius;
    }
}
