package com.xworkz.app.service;

import com.xworkz.app.dao.ProductDao;
import com.xworkz.app.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class ProductServiceImpl implements ProductService{

     @Autowired
       private ProductDao productDao;

    @Override
    public boolean validateAndSave(ProductDto productDto) {
        boolean productValid = false;
        boolean isProductNameValid = false;
        if(productDto != null){
            if(productDto.getProductName() != null  && !productDto.getProductName().isEmpty()){
                isProductNameValid = true;
            }
            if(isProductNameValid){
                productValid = productDao.save(productDto);
            }
        }
        return productValid;
    }

    @Override
    public void UpdateProductId(int id,ProductDto productDto) {
        productDao.UpdateProductId(id,productDto);

    }

    @Override
    public boolean deleteProductId(int id) {
        if (id > 0){
            System.out.println("deleteUser by id");
        }
        return productDao.deleteProductId(id);
    }

    @Override
    public ProductDto getUserById(int id) {
        return  productDao.getUserById(id);
    }

    @Override
    public List<ProductDto> getAllDetails(ProductDto productDto) {
       return productDao.getAllDetails(productDto);
    }



}
