package org.xworkz.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.xworkz.spring.dao.ProductDao;
import org.xworkz.spring.dto.ProductDto;
@Component
public class ProuductSerivrImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    @Override
    public boolean save(ProductDto productDto) {
        return productDao.save(productDto);
    }

    @Override
    public void UpdateUser(ProductDto productDto) {
        productDao.UpdateUser(productDto);
    }

    @Override
    public boolean deleteUserById(int id) {
        return productDao.deleteUserById(id);
    }

    @Override
    public ProductDto getUserbyId(int id) {
        return productDao.getUserbyId(id);
    }

    @Override
    public String getPrpductNameById(int id) {
        return productDao.getPrpductNameById( id);
    }

    @Override
    public Object[] getProductNameAndPriceBYId(int id) {
        return productDao.getProductNameAndPriceBYId(id);
    }

    @Override
    public boolean updateProductNameById(String productName, int id) {
        return productDao. updateProductNameById(productName,id);
    }


}
