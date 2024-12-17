package com.xworkz.app.runner;

import com.xworkz.app.Bank.Bank;
import com.xworkz.app.Bank.Manager;
import com.xworkz.app.configure.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankRunning {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
      Bank bank =  applicationContext.getBean(Bank.class);
      Manager manager =bank.manager;
        System.out.println("manager name :" +manager.ManagerName);
    }
}
