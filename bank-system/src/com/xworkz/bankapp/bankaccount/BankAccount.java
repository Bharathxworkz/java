package com.xworkz.bankapp.bankaccount;

public class BankAccount {
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
    public  void transfer(BankAccount  account,double amount){
        System.out.println("transfer started");
        this.withdraw(amount);
        System.out.println("Amount is withdrawn from the account");
        account.deposit(amount);
        System.out.println("amount sent succesfully");
        System.out.println("transfer ended");
    }
}
