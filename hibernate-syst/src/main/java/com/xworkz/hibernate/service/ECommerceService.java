package com.xworkz.hibernate.service;

import com.xworkz.hibernate.dto.ProductDto;

public interface ECommerceService {
    boolean validateAndSaveProduct(ProductDto dto);

    /*ProductDto getProductById(int id);

    boolean updateProductNameById(String updateProductName , int id);

    boolean removeEcommerce(int id);*/
}
