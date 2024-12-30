package com.xworkz.product.dao;

import com.xworkz.product.dto.ProductDto;

import java.util.List;

public interface ProductDao {

    boolean save(ProductDto productDto);

    void UpdateProductId(int id ,ProductDto productDto);

    ProductDto getUserById(int id);

    List<ProductDto> getAllDetails(ProductDto productDto);

    boolean deleteProductId(int id);

    boolean updatePriceByName(double price,String name);

    double getPriceByName(String name);

    Object [] getCategoryRatingsByName(String name);

    boolean updateCategoryByPrice(String category,double price);

    boolean deleteProductByPrice(double price);

}
