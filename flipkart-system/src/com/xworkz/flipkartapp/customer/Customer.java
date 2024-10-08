package com.xworkz.flipkartapp.customer;

import com.xworkz.flipkartapp.product.Product;

public interface Customer {

    boolean addproduct(Product product);
    void getProductDetails();
    boolean deleteProductDetails(int id);
}
