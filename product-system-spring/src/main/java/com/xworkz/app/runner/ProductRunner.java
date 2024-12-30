package com.xworkz.app.runner;

import com.xworkz.app.config.SpringConfig;
import com.xworkz.app.dto.ProductDto;
import com.xworkz.app.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class ProductRunner {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        ProductDto productDto = new ProductDto();
        productDto.setProductName("dress");
        productDto.setCategory("cloths");
        productDto.setProductNo(8654578);

        ProductDto productDto1 = new ProductDto();
        productDto1.setProductName("decor");
        productDto1.setCategory("user");
        productDto1.setProductNo(34567);

        ProductService productService = applicationContext.getBean(ProductService.class);

       // productService.validateAndSave(productDto);
        productService.validateAndSave(productDto1);

        //get by id
        ProductDto productDto2 = productService.getUserById(14);
        System.out.println(productDto2);

        //get all details
        List<ProductDto> productDtos = productService.getAllDetails(productDto1);
        System.out.println(productDtos);

    }
}
