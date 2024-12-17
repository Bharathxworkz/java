package com.xworkz.app.Bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bank {
    @Autowired
    public Manager manager;
    public Bank(Manager manager){
        this.manager=manager;
    }
    public void getall(){
        this.manager.get();
    }
}
