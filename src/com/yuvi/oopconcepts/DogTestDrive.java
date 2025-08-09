package com.yuvi.oopconcepts;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog bull = new Dog();
        bull.name="charlie";
        bull.height=30;
        bull.weight=23;
        System.out.println(bull.weight);
        bull.bark();

        //state of the object can be changed-
        bull.weight=25;
        System.out.println(bull.weight);
        bull.bark();

//        Dog obj1= new Dog();
        bull.setHeight(35).setWeight(30).display();
    }
}
