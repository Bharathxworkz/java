package com.xworkz.flipkartapp;

import com.xworkz.flipkartapp.customer.Customer;
import com.xworkz.flipkartapp.impl.CustomerImpl;
import com.xworkz.flipkartapp.product.Product;

import java.util.Scanner;

import static java.lang.System.*;

public class CustomerRunner {
    public static void main(String[] args) {

        Customer customer = new CustomerImpl();
        Scanner scanner = new Scanner(in);

        Product product = new Product();

        System.out.println("Enter the productID:");
        int productId = scanner.nextInt();
        product.setProductId(productId);

        scanner.nextLine();

        System.out.println("Enter the productName:");
        String productName = scanner.nextLine();
        product.setProductName(productName);

        System.out.println("Enter the quantity of product:");
        int quantity = scanner.nextInt();
        product.setQuantity(quantity);

        System.out.println("Enter the product ratings:");
        int ratings = scanner.nextInt();
        product.setRatings(ratings);

        // Consume the remaining newline
        scanner.nextLine();

        System.out.println("Enter the product category:");
        String category = scanner.nextLine();
        product.setCategory(category);

        System.out.println("Enter the price of product:");
        double price = scanner.nextDouble();
        product.setPrice(price);

        customer.addproduct(product);
        customer.getProductDetails();


        customer.getProductDetails();

      System.out.println("Enter the id to delete");
     int  id= scanner.nextInt();
     customer.deleteProductDetails(id);
        customer.getProductDetails();
    }

}
