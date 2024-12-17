package com.xworkz.app.task;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Zepto {
    public int productId;
    public String productName;
    public double ratting;
    public  double price;

    public void getZepto(){
        System.out.println("the zepto will proviod the product in 6 min");
    }


}
