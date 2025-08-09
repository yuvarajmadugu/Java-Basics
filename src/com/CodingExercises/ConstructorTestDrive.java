package com.CodingExercises;

public class ConstructorTestDrive {
    public static void main(String[] args) {
//        Constructor personp1 = new Constructor();
        Constructor personp1 = new Constructor("yuvi",20, "male");
        System.out.println("name: "+personp1.getName());
        System.out.println("age: "+personp1.getAge());
        System.out.println("gender: "+personp1.getGender());
    }
}
