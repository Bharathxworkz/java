package com.xworkz.amazon;

import com.xworkz.amazon.customer.Customer;
import com.xworkz.amazon.order.Order;
import com.xworkz.amazon.orderlist.OrderList;
import com.xworkz.amazon.product.Product;

public class AmazonRunner {

    public static void main(String[] args)
    {
        System.out.println("Main started");
        Product product = new Product(22,"Oven","Multipurpose");
        OrderList orderList = new OrderList(259, 7896523, 78,3,product);
        Order order = new Order(25, 25417, orderList);
        Customer customer = new Customer(21,"Bharath L",9019633098L,order);
        customer.getCustomerDetails();
        System.out.println("Main ended");
    }
}
