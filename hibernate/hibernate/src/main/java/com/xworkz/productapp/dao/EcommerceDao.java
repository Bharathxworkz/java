package com.xworkz.productapp.dao;

import com.xworkz.productapp.dto.ProductDto;


public interface EcommerceDao {

    boolean addProduct(ProductDto productDto);
   public ProductDto getProductById(int product_id) ;
   public ProductDto updateProductDetails(int product_id,int price);


}
