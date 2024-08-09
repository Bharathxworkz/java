package com.xworkz.bankapp.currentaccount;
import com.xworkz.bankapp.bankaccount.BankAccount;
public class CurrentAccount extends BankAccount {

    public void CurrentAccount(double minbalance) {

        setBalance(minbalance);
    }

}
