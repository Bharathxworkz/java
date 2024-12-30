package com.xworkz.app.runner;

import com.xworkz.app.config.SpringConfig;
import com.xworkz.app.dto.AmazonDto;
import com.xworkz.app.service.AmazonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class AmazonRunner {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        AmazonDto amazonDto = new AmazonDto();
        amazonDto.setProductName("electric devices");
        amazonDto.setProductQuality("bad");
        amazonDto.setProductPrice("3000");

        AmazonService amazonService = applicationContext.getBean(AmazonService.class);
        amazonService.saveAndValidate(amazonDto);

        //get by id
        AmazonDto amazonDto1 = amazonService.getUserById(5);
        System.out.println(amazonDto1);

        //get all details
        List<AmazonDto> amazonDtos = amazonService.getAllDetails(amazonDto);
        System.out.println(amazonDtos);

        //delete by Id
       // int productIdToDelete = 8; // Replace with the actual ID of the user you want to delete

       // boolean isDeleted = amazonService.deleteProductId(productIdToDelete);

      //  System.out.println("User with ID " + productIdToDelete + " deleted successfully.");

      //  System.out.println("User with ID " + productIdToDelete + " not found.");
        Object[] objects=amazonService.getProductNameAndQualityById(1);
        Arrays.asList(objects).forEach(System.out::println);



    }

}
