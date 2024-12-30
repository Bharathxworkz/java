package com.xworkz.app.runner;

import com.xworkz.app.config.SpringConfig;
import com.xworkz.app.dto.AmazonDto;
import com.xworkz.app.service.AmazonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UpdateById {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        //update by Id
        AmazonDto amazonDto = new AmazonDto();
        amazonDto.setProductName("Calculator");
        amazonDto.setProductQuality("good");
        amazonDto.setProductPrice("250");

        AmazonService amazonService = applicationContext.getBean(AmazonService.class);
        amazonService.saveAndValidate(amazonDto);
        amazonService.UpdateProductId(5,amazonDto);

        System.out.println("Amazon details update successfully");
    }
}
