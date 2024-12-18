package com.xworkz.productapp.service;

import com.xworkz.productapp.dao.EcomerceDaoImpl;
import com.xworkz.productapp.dao.EcommerceDao;
import com.xworkz.productapp.dto.ProductDto;

public class ServiceImpl implements EcommerceService {

    EcommerceDao ecommerceDao = new EcomerceDaoImpl();

    @Override
    public boolean validateAndSaveProduct(ProductDto dto) {
        boolean productNameValid = false;
        boolean productCategoryValid = false;
        if (dto != null) {
            if (dto.getProductName() != null && !dto.getProductName().isEmpty()) {
                System.out.println("Product Name Validated!!....");
                productNameValid = true;
            }
            if (dto.getProductCategory() != null && !dto.getProductCategory().isEmpty()) {
                System.out.println("Product Category Validate!!.....");
                productCategoryValid = true;
            }
        }

        if (productNameValid == true && productCategoryValid == true) {
           productNameValid= ecommerceDao.addProduct(dto);
        }
return true;

    }

    @Override
    public ProductDto getProductById(int product_id) {
        if(product_id>0){
            System.out.println("the code sucessgfully getting details");
        }
        return ecommerceDao.getProductById(product_id) ;
    }

    @Override
    public ProductDto updateProductDetails(int product_id, int price) {
        if (product_id>0);{

        }
        return ecommerceDao.updateProductDetails(product_id,price);
    }
}
