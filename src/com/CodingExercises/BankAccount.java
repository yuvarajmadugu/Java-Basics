package com.CodingExercises;

public class BankAccount {
    private String accountNumber;
    private String accountName;
    private double balance;
    private long phoneNumber;

    public void deposit(double byHowMuch){
        if (byHowMuch>0) {
            this.balance += byHowMuch;
            System.out.println("Deposited Rs." + byHowMuch + "\nCurrent balance is: " + this.balance);
        }else{
            System.out.println("Invalid amount. Please try again");

        }
    }
    public void withdraw(double byHowMuch){
        if(byHowMuch>=0) {
            if (this.balance - byHowMuch >= 0) {
                this.balance -= byHowMuch;
                System.out.println("Withdrawn Rs." + byHowMuch + "\nCurrent balance is: " + this.balance);
            } else {
                System.out.println("Insufficient funds. You have Rs." + this.balance + " in your account");
            }
        }else {
            System.out.println("Invalid amount entered. Please try again");
        }
    }
    public void displayDetails(){
        System.out.println("Account number: "+this.accountNumber);
        System.out.println("Account Holder name: "+this.accountName);
        System.out.println("Current Balance: "+this.balance);
        System.out.println("Phone Number: "+this.phoneNumber);
    }




    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountName(String accountName){
        this.accountName = accountName;
    }
    public String getAccountName(){
        return accountName;
    }

    public void setbalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }

    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public long getPhoneNumber(){
        return phoneNumber;
    }
}
