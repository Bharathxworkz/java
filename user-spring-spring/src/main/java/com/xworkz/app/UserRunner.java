package com.xworkz.app;

import com.xworkz.app.config.SpringConfiguration;
import com.xworkz.app.dto.UserDto;
import com.xworkz.app.service.UserService;
import com.xworkz.app.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        UserDto userDto = new UserDto();
        userDto.setName("Bharath L");
        userDto.setEmail("bharathgmail.com");
        userDto.setPhoneNumber(4567854567L);

//        UserDto userDto1 = new UserDto();
//        userDto1.setUserName("ma");
//        userDto1.setEmail("ma@gmail.com");
//        userDto1.setPhNo(897195720);

        UserService userService = applicationContext.getBean(UserService.class);

       // userService.validateAndSave(userDto);

      //  userService.getUserById(2);

      //  userService.getUserByName("Raksha");

       // userService.getAllUsers();

       // userService.deleteUserById(2);

        userService.updateUser("Bharath L S" , 1);



    }
}
