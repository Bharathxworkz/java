package com.xworkz.amazonapp;

import com.xworkz.amazonapp.customer.Customer;
import com.xworkz.amazonapp.impl.CustomerImpl;
import com.xworkz.amazonapp.product.Product;

import java.util.Scanner;

public class Customerrunner {
    public static void main(String[] args) {
        Customer customer = new CustomerImpl();
        Scanner scanner = new Scanner(System.in);

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

        // Updating price by product ID
        System.out.println("Enter the product ID to update price:");
        int updateProductId = scanner.nextInt();
        System.out.println("Enter the new price:");
        double newPrice = scanner.nextDouble();
        customer.updatePriceById(updateProductId, newPrice);

        customer.getProductDetails();

        // Updating ratings by product name
        scanner.nextLine(); // Consume newline
        System.out.println("Enter the product name to update ratings:");
        String updateProductName = scanner.nextLine();
        System.out.println("Enter the new ratings:");
        int newRating = scanner.nextInt();
        customer.updateRatingsByProductName(updateProductName, newRating);

        customer.getProductDetails();

        // Get product name by product ID
        System.out.println("Enter the product ID to get product name:");
        int getProductId = scanner.nextInt();
       String name = customer.getProductNameById(getProductId);
       if(name !=null) {
           System.out.println("The product name :" + name);
       }else {
           System.out.println("not found");
       }


        // Get product price by product name
        scanner.nextLine(); // Consume newline
        System.out.println("Enter the product name to get the price:");
        String getProductPriceName = scanner.nextLine();
        double prices =customer.getProductPriceByName(getProductPriceName);
        if(prices !=0) {
            System.out.println("the price of product:" + prices);
        }else{
            System.out.println("not found");
        }


        // Get product ratings by product name
        System.out.println("Enter the product name to get product ratings:");
        String getProductRatingsName = scanner.nextLine();
        double rat = customer.getProductRatingsByName(getProductRatingsName);
        if (rat != 0) {
            System.out.println("The product ratings are :" + rat);
        } else {
            System.out.println("not found");
        }

        System.out.println("Enter the ID to delete the product:");
        int id = scanner.nextInt();
        boolean isDeleted = customer.deleteProductDetails(id);
        if (isDeleted) {
            System.out.println("The product has been deleted.");
        } else {
            System.out.println("The given input was not found.");
        }



        customer.getProductDetails();
    }
}
