package com.xworkz.app.runner;

import com.xworkz.app.config.SpringConfig;
import com.xworkz.app.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DeleteProduct {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);


        ProductService userService = applicationContext.getBean(ProductService.class);


        int productIdToDelete = 3; // Replace with the actual ID of the user you want to delete

        boolean isDeleted = userService.deleteProductId(productIdToDelete);


        System.out.println("User with ID " + productIdToDelete + " deleted successfully.");

        System.out.println("User with ID " + productIdToDelete + " not found.");
    }

    }

