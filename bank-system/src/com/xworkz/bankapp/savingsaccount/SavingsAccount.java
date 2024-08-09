package com.xworkz.bankapp.savingsaccount;
<<<<<<< HEAD


import com.xworkz.bankapp.bankaccount.BankAccount;

public class SavingsAccount extends BankAccount {
=======
import com.xworkz.bankapp.bankaccount.bankaccount;

public class SavingsAccount extends bankaccount {
>>>>>>> 50e55590d12db885b16d6810167155211d3c355f
     double intrest = 0.7;

    public SavingsAccount(double minbalance) {

        setBalance(minbalance);
    }
  public void   rateOfIntrest(){
        double intrestAmount = (getBalance()*intrest)/100;
        deposit(intrestAmount);
    }
}
