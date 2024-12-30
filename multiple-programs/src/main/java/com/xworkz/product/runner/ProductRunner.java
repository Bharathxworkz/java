package com.xworkz.product.runner;

import com.xworkz.product.config.PSpringConfiguration;
import com.xworkz.product.dto.ProductDto;
import com.xworkz.product.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class ProductRunner {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PSpringConfiguration.class);
        ProductDto productDto = new ProductDto();
        ProductService productService = applicationContext.getBean(ProductService.class);

        //validate and save;
        productDto.setProductName("Wallet");
        productDto.setCategory("Storage");
        productDto.setProductPrice(1250.0);
        productDto.setRatings(4.9);
        //productService.validateAndSave(productDto);
        System.out.println("Added successfully...!!");

        //get by id;
        ProductDto getById = productService.getUserById(2);
        System.out.println(getById);

        //get all details;
       /* List<ProductDto> productDtoList = productService.getAllDetails(productDto);
        System.out.println(productDtoList);

        //update by id;
       /* ProductDto updateValue = new ProductDto();
        updateValue.setProductName("Television");
        updateValue.setProductPrice(25000.00);
        updateValue.setCategory("Entertainment");
        productService.UpdateProductId(2,updateValue);
        System.out.println("Update successfully....!");

        //delete operation
        productService.deleteProductId(2);
        System.out.println("Row deleted...!");*/

        //update name by price;
        boolean isUpdated = productService.updatePriceByName(589.9,"Laptop");
        System.out.println("Is name updated: "+isUpdated);

        String product = "Laptop";
        Double price = productService.getPriceByName(product);
        System.out.println("The price of "+product +" is: "+price);

        System.out.println("The category and ratings of the given product is: ");
        Object [] getCRByName = productService.getCategoryRatingsByName("Laptop");
        Arrays.stream(getCRByName).forEach(System.out::println);

        boolean isCategoryUpdated = productService.updateCategoryByPrice("Liner",25000);
        System.out.println(isCategoryUpdated);

        boolean isDeleted = productService.deleteProductByPrice(25000);
        System.out.println(isDeleted);
    }
}
