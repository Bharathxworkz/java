package com.xworkz.app.task;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Nayka {
 public int id;
 public String productName;
 public double rating;
 public int quantity;

 public  void nayakaDetails(){
  System.out.println("nayka is the best product app");
 }


}
