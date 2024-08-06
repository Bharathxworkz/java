package com.xworkz.bankapp.savingsaccount;
import com.xworkz.bankapp.bankaccount.bankaccount;

public class SavingsAccount extends bankaccount {
     double intrest = 0.7;

    public SavingsAccount(double minbalance) {

        setBalance(minbalance);
    }
  public void   rateOfIntrest(){
        double intrestAmount = (getBalance()*intrest)/100;
        deposit(intrestAmount);
    }
}
