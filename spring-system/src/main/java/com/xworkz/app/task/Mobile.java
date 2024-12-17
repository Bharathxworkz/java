package com.xworkz.app.task;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")

public class Mobile {

    public String brandName;
    public double price;
    public String ramMemory;
    public String operatingSystem;

    public void getMobileDetails(){
        System.out.println("there are differnt brands of mobile");
    }
}
