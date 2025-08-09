package com.inhertance;

public class Person {
    private String name;
    private String address;
    private long phoneNumber;

    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void greet(){
        System.out.println("Hi from Person class");
    }
}
