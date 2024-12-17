package com.xworkz.app.task;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Stove {
    public  int id;
    public String brandName;
    public double price;
    public  double rating;

    public void getStoveDetails(){
        System.out.println("stove will used to prepare the food");
    }
}
