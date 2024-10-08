package com.xworkz.amazonapp.customer;

import com.xworkz.amazonapp.product.Product;

public interface Customer {
    public boolean addProducts(Product product);
    public void getAllProducts();
    public String getProductNameByCategory(String category);
    public double getProductRatingsByName(String name);
    public double getPriceById(int id);
    public String getBrandbyName(String name);
    public String getProductByRatings(double ratings);
    public String getProductById(int id);
    public String getproductByCategory(String category);
    public String getproductByName(String name);
    public boolean updateRatingsByName(double updatedRatings, String name);
    public boolean updateNameByBrands(String updatedName,String brand);
    public boolean updatePriceByName(double price, String name);
    public boolean updateNameById(String name, int id);
}
