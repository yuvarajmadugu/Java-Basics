package com.inhertance.CodingExercise.Question2;

public class Traingle implements Shape{
    private double base;
    private double height;

    public Traingle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double calculateArea(){
        return 0.5* base * height;
    }
}