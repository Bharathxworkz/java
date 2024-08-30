package com.xworkz.amazon.product;

public class Product {

    public int id;
    public String name;
    public String description;

    public Product(int id, String name, String description)
    {
        if(id > 0)
            this.id = id;
        else System.out.println("Please provide a correct id...");
        if(name != null)
            this.name = name;
        else System.out.println("Provided name is not valid");
        this.description = description;
    }
    public void getProductDetails()
    {
        System.out.println("Product details started");
        System.out.println("The product id is: "+this.id);
        System.out.println("The product name is: "+this.name);
        System.out.println("The product description is: "+this.description);
        System.out.println("Product details ended");
        System.out.println("----------------------------------------------------------");
    }
}
