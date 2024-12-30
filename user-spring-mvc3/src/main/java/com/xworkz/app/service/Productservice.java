package com.xworkz.app.service;

import com.xworkz.app.dto.ProductDto;

import java.util.List;

public interface Productservice {

    boolean save(ProductDto productDto);

    List<ProductDto> getAllProducts();

    boolean deleteProductById(int id);

    public ProductDto getProductById(int id);

    public void updateProduct(ProductDto productDto);

}
