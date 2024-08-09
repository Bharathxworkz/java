package com.xworkz.bankapp.bankaccount;

public class bankaccount {
    public double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0) {
            System.out.println("deposit sucessfull");
            balance = balance + amount;

        }
        else System.out.println("Amount cannot be zero");
    }

    public void withdraw(double amount){
        if(amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdraw successfull");
        }
        else System.out.println("Insufficient Funds");
    }
}
