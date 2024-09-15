package com.xworkz.amazonapp.customer;

import com.xworkz.amazonapp.product.Product;

public interface Customer {

    boolean addproduct(Product product);
    void getProductDetails();
    double updatePriceById(int productId, double newPrice);
   boolean updateRatingsByProductName(String name, double ratings);
    String getProductNameById(int id);
    double getProductPriceByName(String name);
    double getProductRatingsByName(String name);
    boolean deleteProductDetails(int id);
}
