package com.xworkz.productapp.service;

import com.xworkz.productapp.dao.EcommerceDao;
import com.xworkz.productapp.dao.EcommerceDaoImpl;
import com.xworkz.productapp.dto.ProductDto;

public class EcommereceServiceImpl implements EcommereceService{

    EcommerceDao ecommerceDao = new EcommerceDaoImpl();
    @Override
    public boolean validateAndSaveProduct(ProductDto dto) {

        boolean isNameValid = false;
        boolean isPriceValid = false;
        boolean isCategoryValid = false;

        if(dto != null){
            if(dto.getName() != null && !dto.getName().isEmpty()){
                System.out.println("Name validated");
                isNameValid = true;
            }
            if(dto.getPrice() > 0){
                System.out.println("Price validated");
                isPriceValid = true;
            }
            if(dto.getProductCategory() != null && !dto.getProductCategory().isEmpty()){
                System.out.println("Category validated");
                isCategoryValid = true;
            }
        }
        return false;
    }
}
