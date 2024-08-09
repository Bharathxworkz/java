package com.xworkz.bankapp;

import com.xworkz.bankapp.savingsaccount.SavingsAccount;

public class BankAccountRunner {
    public static  void main(String[] args)
    {
        System.out.println("main started");

        SavingsAccount savingsAccount = new SavingsAccount(5000);
        System.out.println(savingsAccount.getBalance());

        savingsAccount.deposit(500);
        System.out.println("The balance after deposit is: "+savingsAccount.getBalance());

        savingsAccount.withdraw(200);
        System.out.println("The balance after withdraw is: "+savingsAccount.getBalance());

        savingsAccount.rateOfIntrest();
        System.out.println("The balance of account:" + savingsAccount.getBalance());
<<<<<<< HEAD


        SavingsAccount momsAccount = new SavingsAccount(1000);

        savingsAccount.transfer(momsAccount,2000);
        System.out.println("The balance of account:" + savingsAccount.getBalance());

        System.out.println("The balance of account:" + momsAccount.getBalance());




=======
>>>>>>> 50e55590d12db885b16d6810167155211d3c355f
    }

}
