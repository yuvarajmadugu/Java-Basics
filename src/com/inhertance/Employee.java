package com.inhertance;

public class Employee extends Person{
    private String empId;
    private float salary;

    public void setSalary(float salary){
        this.salary = salary;
    }

    public float getSalary(){
        return salary;
    }
    public String getEmpId(){
        return "1899";
    }
}
