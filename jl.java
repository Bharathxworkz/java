package com.xworkz.bankapp.currentaccount;

import com.xworkz.bankapp.bankaccount.BankAccount;

public class CurrentAccount {
    private static final double OVERDRAFT_LIMIT = 500.0;
    private double balance;
    private double overdraftAmount;

    public CurrentAccount(double initialBalance) {
        this.balance = initialBalance;
        this.overdraftAmount = 0.0;
    }

    public double getBalance() {
        return balance - overdraftAmount;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            if (overdraftAmount > 0) {
                double overdraftRepayment = Math.min(overdraftAmount, amount);
                overdraftAmount -= overdraftRepayment;
                amount -= overdraftRepayment;
            }
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        double availableBalance = balance + OVERDRAFT_LIMIT - overdraftAmount;
        if (amount <= availableBalance) {
            if (amount > balance) {
                overdraftAmount += (amount - balance);
                balance = 0;
            } else {
                balance -= amount;
            }
            return true;
        }
        return false;
    }

    public double getOverdraftAmount() {
        return overdraftAmount;
    }

    public void setOverdraftAmount(double overdraftAmount) {
        this.overdraftAmount = overdraftAmount;
    }
}
