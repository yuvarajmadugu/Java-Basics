package com.inhertance;

public class allClassesTextDrive {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Yuvaraj");

        Student s1 = new Student();
        s1.setPhoneNumber(8688123456L);
        s1.setCourse("AIML");
        System.out.println("Name: "+p1.getName());
        System.out.println("PhoneNum: "+s1.getPhoneNumber());
        System.out.println("RollNo: "+s1.getRollNo());
        System.out.println("Course: "+s1.getCourse());
        s1.greet();

        StudentEngineering se1 = new StudentEngineering();
        se1.setCourseDuration("2022-2026");
        System.out.println("Engineering Durartion: "+se1.getCourseDuration());

        Employee e1 = new Employee();
        e1.setSalary(654321);
        System.out.println("Salary of e1: "+e1.getSalary());
    }
}
