package com.xworkz.app.task;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Chair {
    public String brandName;
    public double price;
    public String colour;
    public String backStyle;

    public void getChairDetails(){
        System.out.println("the chair will having differnt brands");
    }
}
