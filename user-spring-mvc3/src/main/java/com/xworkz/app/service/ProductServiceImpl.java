package com.xworkz.app.service;

import com.xworkz.app.dto.ProductDto;
import com.xworkz.app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ProductServiceImpl implements  Productservice{
    @Autowired
    ProductRepository productRepository;
    @Override
    public boolean save(ProductDto productDto) {
        boolean userValid = false;
        boolean isUserProductNameValid = false;
        boolean isUserProductColorValid = false;
        if (productDto != null) {
            if (productDto.getProductName() != null && !productDto.getProductName().isEmpty()) {
                isUserProductNameValid = true;

            }
            if (productDto.getProductColor() != null && !productDto.getProductColor().isEmpty()) {
                isUserProductColorValid = true;

            }
        }
        if (isUserProductNameValid == true && isUserProductColorValid==true) {
            userValid = productRepository.save(productDto);
        }

        return userValid;
    }

    @Override
    public List<ProductDto> getAllProducts() {
        return productRepository.getAllProducts();    }

    @Override
    public boolean deleteProductById(int id) {
        return productRepository.deleteProductById(id);
    }

    @Override
    public ProductDto getProductById(int id) {
        return  productRepository.getProductById(id);


    }

    @Override
    public void updateProduct(ProductDto productDto) {
        productRepository.updateProduct(productDto);

    }
}
