package com.xworkz.app.task;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class TV {
    public  String brandName;
    public  double price;
    public String screenSize;
    public String displayTechnology;
    public void getTVdetails(){
        System.out.println("there are differnt TV brands");
    }
}
