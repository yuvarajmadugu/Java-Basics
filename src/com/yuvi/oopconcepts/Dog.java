package com.yuvi.oopconcepts;

public class Dog {
    //state:
    String name;
    int height, weight;
    //behaviour:
    void bark() {
        System.out.println("woof!");
    }

//getter and setter methods
    public int getWeight() {
        return weight;
    }

    public Dog setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public String getName() {
        return name;
    }

    public Dog setName(String name) {
        this.name = name;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public Dog setHeight(int height) {
        this.height = height;
        return this;
    }
    public Dog display(){
        System.out.println("name: "+name);
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weight);
        show(this);
        return this;
    }
    public void show(Dog obj){
        System.out.println("Method callig using object reference");
    }
}
