package com.xworkz.amazon.order;

import com.xworkz.amazon.orderlist.OrderList;

public class Order {

    public int id;
    public int customer_id;
    public OrderList orderlist;

    public Order(int id, int customer_id, OrderList orderlist)
    {
        if(id>0)
            this.id = id;
        else System.out.println("Id is invalid");
        this.customer_id = customer_id;
        this.orderlist = orderlist;
    }
    public void getOrderDetails()
    {
        System.out.println("Order details started");
        System.out.println("The order id is: "+this.id);
        System.out.println("The order customer id is: "+this.customer_id);
        System.out.println("Order details ended");
        System.out.println("-----------------------------------------------------------");
        this.orderlist.getOrderList();
    }
}
