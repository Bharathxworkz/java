package com.xworkz.productapp;

import com.xworkz.productapp.dao.EcomerceDaoImpl;
import com.xworkz.productapp.dao.EcommerceDao;
import com.xworkz.productapp.dto.ProductDto;
import com.xworkz.productapp.service.EcommerceService;
import com.xworkz.productapp.service.ServiceImpl;

import javax.security.auth.login.Configuration;

public class ProductRunner {

    public static void main(String[] args) {

        ProductDto productDto = new ProductDto();
        productDto.setProductId(1);
        productDto.setProductName("Mobile");
        productDto.setProductCategory("Electronic");
        productDto.setPrice(20000);
        productDto.setRatings("4.0");

        EcommerceDao ecommerceDao = new EcomerceDaoImpl();
        EcommerceService ecommerceService = new ServiceImpl();
        ecommerceService.validateAndSaveProduct(productDto);
    }
}
