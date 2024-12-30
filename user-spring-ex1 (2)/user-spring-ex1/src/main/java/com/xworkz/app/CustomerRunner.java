package com.xworkz.app;

import com.xworkz.app.config.SpringConfiguration;
import com.xworkz.app.dto.CustomerDto;
import com.xworkz.app.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        CustomerDto userDto = new CustomerDto();
        userDto.setCustomerName("Bharath");
        userDto.setAddress("Kundapur");


//
        CustomerService customerService = applicationContext.getBean(CustomerService.class);
        customerService.getUserById(5);
        customerService.getUserByName("Bharath L");
        customerService.updateUser("Bharath L",4);
        customerService.getAllUsers();
        customerService.deleteUserById(4);

      //  customerService.validateAndSave(userDto);

     //   customerService.getUserById(2);

     //   customerService.getUserByName("Bharath");

      //  customerService.getAllUsers();

      //  customerService.deleteUserById(3);

        customerService.updateUser("Bharath R" , 4);



    }
}
