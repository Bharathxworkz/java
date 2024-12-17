package com.xworkz.app.task;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Pen {
    public  String brandName;
    public  double price;
    public String color;

    public  void getPen(){
        System.out.println("there are different type of pen");
    }
}
