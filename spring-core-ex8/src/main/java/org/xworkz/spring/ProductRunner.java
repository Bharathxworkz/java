package org.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.xworkz.spring.config.SpringConfiguration;
import org.xworkz.spring.dto.ProductDto;
import org.xworkz.spring.service.ProductService;
import org.xworkz.spring.service.ProuductSerivrImpl;

import java.util.Arrays;

public class ProductRunner {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        ProductDto productDto = new ProductDto();
        productDto.setProductName("phone");
        productDto.setPrice(1000);
        productDto.setQuantity(1);

        ProductService productService = applicationContext.getBean(ProductService.class);
        productService.save(productDto);
       ProductDto productDto1 = productService.getUserbyId(4);
        System.out.println(productDto1);
        productService.UpdateUser(productDto);
       String str = productService.getPrpductNameById(2);
        System.out.println(str);
        Object [] object =productService.getProductNameAndPriceBYId(2);
        Arrays.asList(object).forEach(System.out::println);
       boolean updated = productService.updateProductNameById("Shampo",2);
        System.out.println("status of update :"+updated);

       // productService.deleteUserById(1);
    }
}
