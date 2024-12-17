package com.xworkz.app.task;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Jacket {
    public int jacketId;
    public String brandName;
    public String color;
    public double price;

    public void jaketDetails(){
        System.out.println("there are different different jackets are there");
    }

}
