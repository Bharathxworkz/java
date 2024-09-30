package com.xworkz.amazonapp.impl;

import com.xworkz.amazonapp.customer.Customer;
import com.xworkz.amazonapp.product.Product;

public class CustomerImpl implements Customer {
    Product product[] = new Product[1];
    int index;

    @Override
    public boolean addproduct(Product product) {
        boolean isAdded = false;
        if (product != null) {
            if (product.getProductName() != null) {
                if (index < this.product.length) { // Check array bounds
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

    @Override
    public double updatePriceById(int productId, double newPrice) {
        boolean found = false; // To track if the product is found
        for (int i = 0; i < product.length; i++) {
            if (product[i] != null && product[i].getProductId() == productId) {
                product[i].setPrice(newPrice);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found with ID: " + productId);
        }
        return newPrice;
    }

    @Override
    public boolean updateRatingsByProductName(String name, double ratings) {
        boolean isRatingsUpdated = false;
        for (int i = 0; i < product.length; i++) {
            if (product[i] != null && product[i].getProductName().equals(name)) {
                product[i].setRatings(ratings);
                isRatingsUpdated = true;
                break; // Exit loop once product is found
            }
        }
        if (!isRatingsUpdated) {
            System.out.println("Product not found with name: " + name);
        }
        return isRatingsUpdated;
    }

    @Override
    public String getProductNameById(int id) {
        for (int i = 0; i < product.length; i++) {
            if (product[i] != null && product[i].getProductId() == id) {
                return product[i].getProductName();
            }
        }

        return "null";
    }

    @Override
    public double getProductPriceByName(String name) {
        for (int i = 0; i < product.length; i++) {
            if (product[i] != null && product[i].getProductName().equals(name)) {
                return product[i].getPrice();
            }
        }

        return 0.0; // Return -1 to indicate the product was not found
    }

    @Override
    public double getProductRatingsByName(String name) {
        for (int i = 0; i < product.length; i++) {
            if (product[i] != null && product[i].getProductName().equals(name)) {
                return product[i].getRatings();
            }
        }
        return 0.0; // Return -1 if no ratings are found
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
