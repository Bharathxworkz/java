package com.xworkz.app.task;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Zomato {
    public int id;
    public  String foodName;
    public  double price;
    public int quantity;


    public void getZomatodetails(){
        System.out.println("zomato will provoid good food");
    }
}
