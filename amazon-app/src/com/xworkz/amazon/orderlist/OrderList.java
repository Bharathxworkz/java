package com.xworkz.amazon.orderlist;

import com.xworkz.amazon.product.Product;

public class OrderList {

    public int id;
    public int order_id;
    public int product_id;
    public int quantity;
    public Product product;

    public OrderList(int id, int order_id, int product_id, int quantity,Product product)
    {
        if(id>0)
            this.id = id;
        else System.out.println("id is not valid");
        this.order_id = order_id;
        this.product_id = product_id;
        if(quantity > 0)
            this.quantity = quantity;
        else System.out.println("Select the quantity");
        this.product = product;
    }
    public void getOrderList()
    {
        System.out.println("The order list started");
        System.out.println("The order list id is: "+this.id);
        System.out.println("The order list id is: "+this.order_id);
        System.out.println("The product(orderlist) id is: "+this.product_id);
        System.out.println("The quantity(orderlist) is: "+this.quantity);
        System.out.println("Order list ended");
        System.out.println("---------------------------------------------------------");
        this.product.getProductDetails();
    }
}
