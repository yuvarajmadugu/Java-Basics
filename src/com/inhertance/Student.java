package com.inhertance;

public class Student extends Person{
    private short rollNo;
    private String course;

    public void setCourse(String course){
        this.course = course;
    }

    public short getRollNo(){
        return 23;
    }
    public String getCourse(){
        return course;
    }

    public void greet(){
        System.out.println("Hi from Student class");
    }
}
