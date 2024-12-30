package com.xworkz.app.runner;

import com.xworkz.app.config.SpringConfig;
import com.xworkz.app.dto.ProductDto;
import com.xworkz.app.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UpdateUserId {

    public static void main(String[] args) {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        ProductDto productDto = new ProductDto();
        productDto.setProductName("Calculator");
        productDto.setCategory("Electronics");
        productDto.setProductNo(90874);

        ProductService productService = applicationContext.getBean(ProductService.class);

        productService.validateAndSave(productDto);
        productService.UpdateProductId(10,productDto);

        System.out.println("Product updated successfully.");
    }
}
