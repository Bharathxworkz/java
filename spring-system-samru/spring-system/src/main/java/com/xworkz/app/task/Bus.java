package com.xworkz.app.task;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Bus {
    public String founders;
    public String ceo;
    public String headquarters;
    public double price;
    public String busName;

    public void busDetails(){
        System.out.println(" travelling from source to destination ");
    }
}
