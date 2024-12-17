package com.xworkz.app.task;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class CustomerDto {
    public  int customerId;
    public String name;
    public long phoneNumber;
    public String address;

    public  void getCustomerDetails(){
        System.out.println("the customer details are stored");
    }
}
