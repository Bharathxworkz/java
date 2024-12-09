package com.xworkz.hibernate;

import com.xworkz.hibernate.dao.ECommerceDao;
import com.xworkz.hibernate.dao.ECommerceDaoImpl;
import com.xworkz.hibernate.dto.ProductDto;
import com.xworkz.hibernate.service.ECommerceService;
import com.xworkz.hibernate.service.ECommerceServiceImpl;
import org.hibernate.SessionFactory;
import org.hibernate.boot.internal.SessionFactoryBuilderImpl;
import org.hibernate.internal.SessionFactoryImpl;

public class ProductRunner {
    public static void main(String[] args) {

        ProductDto productDto = new ProductDto();
        productDto.setProductName("Dove Shampoo");
        productDto.setProductCategory("general");
        productDto.setRatings(4.9);
        productDto.setPrice(300.00);

        ECommerceService eCommerceService = new ECommerceServiceImpl();
        eCommerceService.validateAndSaveProduct(productDto);
//       ProductDto dto = eCommerceService.getProductById(4);
//       System.out.println(dto);

//       eCommerceService.updateProductNameById("Redmi",1);
    //    eCommerceService.removeEcommerce(67);
    }
}
