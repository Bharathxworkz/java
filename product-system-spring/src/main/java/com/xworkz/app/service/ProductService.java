package com.xworkz.app.service;

import com.xworkz.app.dto.ProductDto;

import java.util.List;

public interface ProductService {

    boolean validateAndSave(ProductDto productDto);

    void UpdateProductId(int id,ProductDto productDto);

    boolean deleteProductId(int id);

    ProductDto getUserById(int id);

    List<ProductDto> getAllDetails(ProductDto productDto);

}
