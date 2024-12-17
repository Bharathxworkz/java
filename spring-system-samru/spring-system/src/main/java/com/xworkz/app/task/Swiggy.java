package com.xworkz.app.task;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Swiggy {
    public int id;
    public String foodName;
    public  double price;
    public int quantity;
    public  void getSwiggy(){
        System.out.println("the swiggy will gives differnt type of food");

    }
}
