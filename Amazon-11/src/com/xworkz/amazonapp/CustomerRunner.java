package com.xworkz.amazonapp;

import com.xworkz.amazonapp.customer.Customer;
import com.xworkz.amazonapp.impl.CustomerImpl;
import com.xworkz.amazonapp.product.Product;

import java.util.Scanner;

public class CustomerRunner {
    public static void main(String[] args) {
        Customer customer = new CustomerImpl();
        Scanner scanner = new Scanner(System.in);

        for (int index = 0; index < 2; index++) {
            Product product = new Product();

            System.out.println("Enter the id");
            int id = scanner.nextInt();
            product.setId(id);
         scanner.nextLine();
            System.out.println("Enter the name");
            String name = scanner.next();
            product.setName(name);
            scanner.nextLine();
            System.out.println("Enter the category");
            String category = scanner.next();
            product.setCategory(category);
            scanner.nextLine();
            System.out.println("Enter the price");
            double price = scanner.nextDouble();
            product.setPrice(price);

            System.out.println("Enter the brand");
            String brand = scanner.next();
            product.setBrand(brand);
            scanner.nextLine();
            System.out.println("Enter the ratings");
            double ratings = scanner.nextDouble();
            product.setRatings(ratings);

            customer.addProducts(product);
        }
        customer.getAllProducts();

        //get Product Name By Category
         System.out.println("Enter the category which you want the name");
         String category = scanner.next();
         String name = customer.getProductNameByCategory(category);
        System.out.println("The product name is: "+name);
    }
}
        /*System.out.println("Main started");

        Product product = new Product();
        product.setId(1);
        product.setName("TV");
        product.setCategory("Entertainment");
        product.setPrice(5000.0);
        product.setBrand("Okea");
        product.setRatings(4.8);
        System.out.println("The details are: "+product);
        customer.addProducts(product);

        Product product1 = new Product();
        product1.setId(2);
        product1.setName("AC");
        product1.setCategory("Cooler");
        product1.setPrice(15000.0);
        product1.setBrand("Aear");
        product1.setRatings(4.5);
        System.out.println("The details are: "+product1);
        customer.addProducts(product1);

        String name = customer.getProductNameByCategory("Cooler");
        System.out.println("The product name is: "+name);


        Product product2 = new Product();
        product2.setId(3);
        product2.setName("Slipper");
        product2.setCategory("Safety");
        product2.setPrice(4000.0);
        product2.setBrand("Crocks");
        product2.setRatings(4.5);
        System.out.println("The details are: "+product2);
        customer.addProducts(product2);

        Product product3 = new Product();
        product3.setId(4);
        product3.setName("Kurta");
        product3.setCategory("Traditional");
        product3.setPrice(1500.0);
        product3.setBrand("Trenda");
        product3.setRatings(4.3);
        System.out.println("The details are: "+product3);
        customer.addProducts(product3);

        Product product4 = new Product();
        product4.setId(5);
        product4.setName("Watch");
        product4.setCategory("Smart Watch");
        product4.setPrice(2000.0);
        product4.setBrand("Noise");
        product4.setRatings(4.1);
        System.out.println("The details are: "+product4);
        customer.addProducts(product4);

        Product product5 = new Product();
        product5.setId(6);
        product5.setName("Buds");
        product5.setCategory("Wireless");
        product5.setPrice(1600.0);
        product5.setBrand("oppo Enco Buds");
        product5.setRatings(4.8);
        System.out.println("The details are: "+product5);
        customer.addProducts(product5);

        String name1 = customer.getProductNameByCategory("wireless");
        System.out.println("The product name is: "+name1);


        //customer.getAllProducts();


        //get Product Name By Category
//        System.out.println("Enter the category which you want the name");
//        String category = scanner.next();
//        //customer.getProductNameByCategory(category);


//        //getProductRatingsByName;
//        System.out.println("Enter a name which you want the ratings");
//        name = scanner.next();
//        double ratings = customer.getProductRatingsByName(name);
//        System.out.println("The provided name ratings is: "+ratings);


        System.out.println("Main ended");*/

