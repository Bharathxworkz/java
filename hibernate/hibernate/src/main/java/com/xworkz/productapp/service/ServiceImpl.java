package com.xworkz.productapp.service;

import com.xworkz.productapp.dao.EcommerceDao;
import com.xworkz.productapp.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceImpl implements EcommerceService {

    @Autowired
    private EcommerceDao ecommerceDao;

    @Override
    public boolean validateAndSaveProduct(ProductDto dto) {
        if (dto == null) {
            System.out.println("ProductDto is null, cannot validate or save.");
            return false;
        }



        boolean isProductNameValid = dto.getProductName() != null && !dto.getProductName().isEmpty();
        if (!isProductNameValid) {
            System.out.println("Product name is invalid.");
            return false;
        }

        boolean isProductCategoryValid = dto.getProductCategory() != null && !dto.getProductCategory().isEmpty();
        if (!isProductCategoryValid) {
            System.out.println("Product category is invalid.");
            return false;
        }

        return ecommerceDao.addProduct(dto);
    }
}
