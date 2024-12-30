package com.xworkz.userapp;


import com.xworkz.userapp.config.SpringConfiguration;
import com.xworkz.userapp.dto.SuperMarketDto;
import com.xworkz.userapp.service.SuperMarketService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class SuperMarketRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        SuperMarketDto superMarketDto = new SuperMarketDto();
        superMarketDto.setProductName("Lipstic");
        superMarketDto.setProductPrice(599);
        superMarketDto.setProductCategory("Cosmetics");
        superMarketDto.setManufactureDate("21/02/2024");
        superMarketDto.setExpiryDate("21/02/2025");



        SuperMarketService superMarketService = applicationContext.getBean(SuperMarketService.class);



       superMarketService.save(superMarketDto);
       SuperMarketDto superMar =   superMarketService.getSuperMarketDetailsById(1);
      System.out.println(superMar);

     SuperMarketDto superMarketDto1 = superMarketService.getSuperMarketDetailsByName("milk");
      System.out.println(superMarketDto1);

      superMarketService.getPriceById(1);
   Object object [] =   superMarketService.getProductNameAndProductCategoryById(1);
        Arrays.stream(object).forEach(System.out::println);
    Object object1 [] =  superMarketService.getProductNameAndProductCategoryByManufactureDate("2024-10-20");
Arrays.stream(object1).forEach(System.out::println);
      boolean isupdated = superMarketService.updatePriceByProductName(2500,"milk");
        System.out.println(isupdated);
        
 boolean del =  superMarketService.deleteSuperMarketById(5);
        System.out.println(del);
    }
}
