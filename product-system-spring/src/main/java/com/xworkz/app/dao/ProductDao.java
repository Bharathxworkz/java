package com.xworkz.app.dao;

import com.xworkz.app.dto.ProductDto;

import java.util.List;

public interface ProductDao {

    boolean save(ProductDto productDto);
    void UpdateProductId(int id ,ProductDto productDto);
    boolean deleteProductId(int id);
    ProductDto getUserById(int id);
    List<ProductDto> getAllDetails(ProductDto productDto);


}
