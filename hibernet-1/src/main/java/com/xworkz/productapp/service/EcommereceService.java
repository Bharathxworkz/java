package com.xworkz.productapp.service;

import com.xworkz.productapp.dto.ProductDto;

public interface EcommereceService {
   boolean validateAndSaveProduct(ProductDto dto);
}
