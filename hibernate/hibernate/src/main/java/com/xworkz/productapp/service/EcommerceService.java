package com.xworkz.productapp.service;

import com.xworkz.productapp.dto.ProductDto;

public interface EcommerceService {

   boolean validateAndSaveProduct(ProductDto dto);
}
