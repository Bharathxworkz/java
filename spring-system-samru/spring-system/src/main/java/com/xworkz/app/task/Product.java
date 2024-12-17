package com.xworkz.app.task;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Product {
    public int productId;
    public String productName;
    public double price;
    public String quanyity;

    public void getProduct(){
        System.out.println("there are diffrent type of product");
    }

}
