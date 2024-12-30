package com.xworkz.productapp;

import com.mysql.cj.xdevapi.SessionImpl;
import com.xworkz.productapp.config.SpringConfiguration;
import com.xworkz.productapp.dao.EcomerceDaoImpl;
import com.xworkz.productapp.dao.EcommerceDao;
import com.xworkz.productapp.dto.ProductDto;
import com.xworkz.productapp.service.EcommerceService;
import com.xworkz.productapp.service.ServiceImpl;
import org.hibernate.internal.SessionFactoryImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.security.auth.login.Configuration;

public class ProductRunner {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
    /* ProductDto productDto =   applicationContext.getBean(ProductDto.class);*/
        ProductDto productDto = new ProductDto();
        productDto.setProductId(5);
        productDto.setProductName("Mobile");
        productDto.setProductCategory("Electronic");
        productDto.setPrice(20000);
        productDto.setRatings("4.0");

        ProductDto productDto1 = new ProductDto();
        productDto1.setProductId(6);
        productDto1.setProductName("phone");
        productDto1.setProductCategory("Electronic");
        productDto1.setPrice(300);
        productDto1.setRatings("4.0");

        EcommerceService ecommerceService = new ServiceImpl();
        ecommerceService.validateAndSaveProduct(productDto);
   /* ProductDto dto =   ecommerceService.getProductById(1);
       System.out.println(dto);
       ProductDto dto1 = ecommerceDao.updateProductDetails(1,100);
        System.out.println(dto1);*/
    }

}
