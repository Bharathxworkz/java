package com.xworkz.amazon.customer;

import com.xworkz.amazon.order.Order;

public class Customer {
    public int id;
    public String name;
    public long phoneNo;
    public Order order;

    public Customer(int id, String name, long phoneNo, Order order)
    {
        if(id >0 && name != null  && phoneNo>0)
        {
            this.id = id;
            this.name = name;
            this.phoneNo = phoneNo;
            this.order = order;
        }
        else System.out.println("Provide all valid information");
    }
    public void getCustomerDetails()
    {
        System.out.println("customer details started");
        System.out.println("The customer id is: "+this.id);
        System.out.println("The customer name is: "+this.name);
        System.out.println("The customer phone number is: "+this.phoneNo);
        System.out.println("Customer details ended");
        System.out.println("-------------------------------------------------------");
        this.order.getOrderDetails();
    }
}
