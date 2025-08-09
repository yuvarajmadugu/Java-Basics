package com.inhertance.CodingExercise;

public class Division implements ArithmaticOperations{
    public double calculate(int a, int b){
        if(b==0){
            throw new ArithmeticException("Divided by zero i.e denominator is zero(undefined) ");
        }
        return a+b;
    }
}
