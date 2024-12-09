package com.xworkz.userapp.service;

import com.xworkz.userapp.dao.UserDao;
import com.xworkz.userapp.dao.UserDaoImpl;
import com.xworkz.userapp.dto.UserDto;

public class UserServiceImpl implements UserService{
    UserDao userDao = new UserDaoImpl();

    @Override
    public boolean validateAndSaveUser(UserDto dto) {
        boolean userIdValid = false;
        boolean userNameValid = false;
        boolean userSaved = false;
        if ((dto!=null)){
            if(dto.getUserId() != 0){
                System.out.println("User Id validated");
                userIdValid = true;
            }
            if(dto.getFirstName() != null && !dto.getFirstName().isEmpty()){
                System.out.println("User name validated");
                userNameValid = true;
            }
        }
        if(userIdValid == true && userNameValid == true)
            userSaved =  userDao.addUser(dto);
        return userSaved;
    }
}
