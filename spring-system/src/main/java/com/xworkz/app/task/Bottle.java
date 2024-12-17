package com.xworkz.app.task;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Bottle {
    public String brandName;
    public String capacity;
    public String colour;
    public int price;


    public void bottleDetails(){
        System.out.println("bottle is used to fill the water");
    }
}
