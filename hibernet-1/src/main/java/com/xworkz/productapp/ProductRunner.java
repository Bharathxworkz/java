package com.xworkz.productapp;

import com.xworkz.productapp.dto.ProductDto;
import com.xworkz.productapp.service.EcommereceService;
import com.xworkz.productapp.service.EcommereceServiceImpl;

public class ProductRunner {
    public static void main(String[] args) {

        ProductDto productDto = new ProductDto();

        productDto.setProductId(1);
        productDto.setName("Oven");
        productDto.setProductCategory("Solar");
        productDto.setPrice(15000.0);
        productDto.setRatings(4.1);

        EcommereceService ecommereceService = new EcommereceServiceImpl();
        ecommereceService.validateAndSaveProduct(productDto);
       // System.out.println(productDto);
    }
}
