package com.xworkz.app.task;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class EarDopes {
    public String brandName;
    public double price;
    public String color;

    public  void getEardopsDetails(){
        System.out.println("the Eardopes are different brands");
    }
}
