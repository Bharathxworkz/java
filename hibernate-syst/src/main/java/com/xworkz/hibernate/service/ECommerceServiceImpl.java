package com.xworkz.hibernate.service;

import com.xworkz.hibernate.dao.ECommerceDao;
import com.xworkz.hibernate.dao.ECommerceDaoImpl;
import com.xworkz.hibernate.dto.ProductDto;

public class ECommerceServiceImpl implements ECommerceService {
    ECommerceDao eCommerceDao = new ECommerceDaoImpl();

    @Override
    public boolean validateAndSaveProduct(ProductDto dto) {
        boolean productNameValid = false;
        boolean productCategoryValid = false;
        boolean productStored = false;
        if ((dto != null)) {
            if (dto.getProductName() != null && !dto.getProductName().isEmpty()) {
                System.out.println("Product name validated");
                productNameValid = true;
            }
            if (dto.getProductCategory() != null && !dto.getProductCategory().isEmpty()) {
                System.out.println("Product Category validated");
                productCategoryValid = true;
            }
        }
        if (productNameValid == true && productCategoryValid == true)
            productStored = eCommerceDao.addProduct(dto);
        return productStored;
    }
}

  /*  @Override
    public ProductDto getProductById(int productId) {
           if(productId > 0)
              return  eCommerceDao.getProductById(productId);

           return null;
    }

    @Override
    public boolean updateProductNameById(String updateProductName, int id) {
        return eCommerceDao.updateProductNameById(updateProductName,id);
    }

    @Override
    public boolean removeEcommerce(int id) {
        return eCommerceDao.removeEcommerce(id);
    }
}*/
