package com.CodingExercises;

public class BankAccountTestDrive {
    public static void main(String[] args) {
        BankAccount yuviAccount = new BankAccount();
        yuviAccount.setAccountNumber("6luckyyuvi9");
        yuviAccount.setAccountName("Yuvaraj Madugu");
        yuviAccount.setPhoneNumber(8688123456L);
        yuviAccount.deposit(1000);
        yuviAccount.withdraw(150);
        yuviAccount.withdraw(1500);
        yuviAccount.deposit(-500);
        yuviAccount.withdraw(-500);
        yuviAccount.displayDetails();
    }
}
