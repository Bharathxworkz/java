package com.xworkz.app.task;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Laptop {
    public  String brandName;
    public  String  operatingSystem;
    public String memory;
    public double price;


    public void getLaptopDetails(){
        System.out.println("there are different laptop brands");
    }

}
