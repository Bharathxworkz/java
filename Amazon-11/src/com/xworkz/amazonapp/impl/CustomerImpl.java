package com.xworkz.amazonapp.impl;

import com.xworkz.amazonapp.customer.Customer;
import com.xworkz.amazonapp.product.Product;
import jdk.nashorn.internal.parser.Scanner;

public class CustomerImpl implements Customer {

    Product  product [] = new Product[2];
    int index;
    boolean isadded = true;

    @Override
    public boolean addProducts(Product product) {
        if (product != null) {
            if (product.getName() != null && product.getPrice() > 0 && product.getRatings() > 0.0) {
                this.product[index++] = product;
                isadded = true;
            }
        }
        return isadded;
    }

  @Override
   public void getAllProducts() {
       for (Product product : product)
            System.out.println("product details: " + product);
    }

    @Override
    public String getProductNameByCategory(String category) {
        System.out.println("getProductNameByCategory started");
        String name = null;
        for (int index = 0; index < product.length; index++) {

                if (this.product[index].getCategory().equals(category)) {
                    name = this.product[index].getName();
                }
        }
        System.out.println("getProductNameByCategory ended");
                    return name;

    }

    @Override
    public double getProductRatingsByName(String name) {
        System.out.println("getProductRatingsByName started");
        double ratings = 0.0;
            if (this.product[index].getName().equals(name)) {
                ratings = this.product[index].getRatings();
            }
            System.out.println("getProductRatingsByName ended");
        return ratings;
    }

    @Override
    public double getPriceById(int id) {
        return 0;
    }

    @Override
    public String getBrandbyName(String name) {
        return "";
    }

    @Override
    public String getProductByRatings(double ratings) {
        return "";
    }

    @Override
    public String getProductById(int id) {
        return "";
    }

    @Override
    public String getproductByCategory(String category) {
        return "";
    }

    @Override
    public String getproductByName(String name) {
        return "";
    }

    @Override
    public boolean updateRatingsByName(double updatedRatings, String name) {
        return false;
    }

    @Override
    public boolean updateNameByBrands(String updatedName, String brand) {
        return false;
    }

    @Override
    public boolean updatePriceByName(double price, String name) {
        return false;
    }

    @Override
    public boolean updateNameById(String name, int id) {
        return false;
    }
}

