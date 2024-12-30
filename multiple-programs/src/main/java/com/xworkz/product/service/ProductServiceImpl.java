package com.xworkz.product.service;

import com.xworkz.product.dao.ProductDao;
import com.xworkz.product.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
    public boolean updatePriceByName(double price, String name) {
        boolean nameUpdated = false;
        if (name != null && !name.isEmpty()) {
            nameUpdated = productDao.updatePriceByName(price, name);
        }
        return nameUpdated;
    }

    @Override
    public double getPriceByName(String name) {
        return productDao.getPriceByName(name);
    }

    @Override
    public Object[] getCategoryRatingsByName(String name) {
        Object [] obj = productDao.getCategoryRatingsByName(name);
        return obj;
    }

    @Override
    public boolean updateCategoryByPrice(String category, double price) {
        return productDao.updateCategoryByPrice(category,price);
    }

    @Override
    public boolean deleteProductByPrice(double price) {
        return productDao.deleteProductByPrice(price);
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
