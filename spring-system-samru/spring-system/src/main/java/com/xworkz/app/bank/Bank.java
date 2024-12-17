package com.xworkz.app.bank;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Bank {
    @Autowired
    public Manager manager;

    @Value("Bank of Baroda")
    private String bankName;

    public Bank(Manager manager){
        this.manager=manager;
    }

    public void getBankDetails(){
        System.out.println("Bank name is " + bankName);
        manager.getManagerDetails();
    }

}
