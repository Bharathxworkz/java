package com.xworkz.app.runner;

import com.xworkz.app.Bank.Bank;
import com.xworkz.app.configure.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
       Bank bank = applicationContext.getBean(Bank.class);
       bank.getall();

    }
}
