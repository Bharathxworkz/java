package com.xworkz.app.runner;

import com.xworkz.app.config.SpringConfiguration;
import com.xworkz.app.dto.UserDto;
import com.xworkz.app.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class UserRunner {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        UserDto userDto = new UserDto();
        userDto.setUserName("suhas");
        userDto.setEmail("bharath@gmail.com");
        userDto.setPhNo(25687654);

        UserDto userDto1 = new UserDto();
        userDto1.setUserName("don");
        userDto1.setEmail("ma@gmail.com");
        userDto1.setPhNo(897195720);


        // Retrieve UserService bean from the application context
        UserService userService = applicationContext.getBean(UserService.class);

        // Save users
        userService.validateAndSave(userDto);
        userService.validateAndSave(userDto1);
       String email = userService.getEmailById(1);
        System.out.println(email);
      Object [] objects =  userService.getNameAndEmailById(2);
        Arrays.stream(objects).forEach(System.out::println);
        Object [] objects1 = userService.getNameandAgeBYAdhar(123456789013L);
        Arrays.stream(objects1).forEach(System.out::println);

      boolean isupdated=  userService.updateNameByAdharNo("Bharath L",123456789014L);
        System.out.println("Status of update :"+isupdated);
       boolean isdeleted = userService.deleteById(4);
        System.out.println("status of delete operation :"+isdeleted);

     boolean done =   userService.updareNmaeByid("Bharath L",5);
        System.out.println(done);

       String name =userService.getNameBYId(5);
        System.out.println("The user Name :"+name);

       String address= userService.getAddressById(1);
        System.out.println("The Address of user :"+address);

       Object [] objects2 = userService.getAdharNoandNameById(2);
       Arrays.stream(objects2).forEach(System.out::println);

    }
}


