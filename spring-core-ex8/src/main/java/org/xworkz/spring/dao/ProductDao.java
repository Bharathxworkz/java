package org.xworkz.spring.dao;

import org.xworkz.spring.dto.ProductDto;

public interface ProductDao {
    boolean save(ProductDto productDto);
    void UpdateUser(ProductDto productDto);
    boolean deleteUserById(int id);
    ProductDto getUserbyId(int id);

    String getPrpductNameById(int id);

    Object[] getProductNameAndPriceBYId(int id);

    boolean updateProductNameById(String productName, int id);
}
