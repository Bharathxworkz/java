package com.xworkz.productapp.service;

import com.xworkz.productapp.dto.ProductDto;

public interface EcommerceService {

   boolean validateAndSaveProduct(ProductDto dto);
 /*  public ProductDto getProductById(int product_id);
   public ProductDto updateProductDetails(int product_id,int price);*/
}
