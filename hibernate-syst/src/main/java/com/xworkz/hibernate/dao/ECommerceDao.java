package com.xworkz.hibernate.dao;

import com.xworkz.hibernate.dto.ProductDto;

public interface ECommerceDao {
    boolean addProduct(ProductDto productDto);

   /* ProductDto getProductById(int productId);

    boolean updateProductNameById(String updateProductName , int id);

    boolean removeEcommerce(int id);*/
}
