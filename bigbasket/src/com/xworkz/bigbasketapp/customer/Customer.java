package com.xworkz.bigbasketapp.customer;

import com.xworkz.bigbasketapp.shoppingbasket.ShoppingBasket;

public class Customer {

    public String email;
    public String name;
    public long phoneNo;
    public String address;
    public ShoppingBasket shoping;

    public Customer(String email, String name, long phoneNo, String address, ShoppingBasket shoping)
    {
        this.email = email;
        this.name = name;
        this.phoneNo = phoneNo;
        this.address = address;
        this.shoping = shoping;
    }
    public void getCustomerDetails()
    {
        System.out.println("Customer details started");
        System.out.println("The customer email is: "+this.email);
        System.out.println("The customer name is: "+this.name);
        System.out.println("The customer phone number is: "+this.phoneNo);
        System.out.println("The customer address is: "+this.address);
        System.out.println("Customer details ended");
        System.out.println("----------------------------------------------------------");
        this.shoping.getShopBasketDetails();
    }
}
