package com.xworkz.flipkartapp.impl;

import com.xworkz.flipkartapp.customer.Customer;
import com.xworkz.flipkartapp.product.Product;

public class CustomerImpl implements Customer {
        Product product[] = new Product[1];
        int index;

        @Override
        public boolean addproduct(Product product) {
            boolean isAdded = false;
            if (product != null) {
                if (product.getProductName() != null) {
                    if (index < this.product.length) { // Check arr
                        this.product[index++] = product;
                        isAdded = true;
                    } else {
                        System.out.println("Product array is full, cannot add more products.");
                    }
                }
            } else {
                System.out.println("Product is null, cannot add.");
            }
            return isAdded;
        }


    @Override
        public void getProductDetails() {
            for (Product product : this.product) {
                if (product != null) {
                    System.out.println("Product details are: " + product);
                } else {
                    System.out.println("No product details to show.");
                }
            }
        }


        public boolean deleteProductDetails(int id) {
            boolean isDeleted=false;
            for (int index = 0; index < product.length; index++) {
                if (product[index] != null && product[index].getProductId() == id) {
                    // Shift all elements to the left after the found index
                    for (int j = index; j < product.length - 1; j++) {
                        product[j] = product[j + 1];
                    }
                    product[product.length - 1] = null; // Set last element to null after shifting
                    isDeleted=true; // Return true when the product is successfully deleted
                }
            }
            return isDeleted; // Return false if product ID was not found
        }

    }


