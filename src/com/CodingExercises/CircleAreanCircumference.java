package com.CodingExercises;

public class CircleAreanCircumference {
    private double radius;
    public void setRadius(double radius){
        if(radius>=0){
            this.radius = radius;
        }else {
            this.radius=1;
        }
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getcircumference(){
        return 2*Math.PI*radius;
    }
}
