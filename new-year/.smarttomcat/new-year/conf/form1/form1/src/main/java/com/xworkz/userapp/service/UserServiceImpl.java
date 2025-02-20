package com.xworkz.userapp.service;

import com.xworkz.userapp.dao.UserDao;
import com.xworkz.userapp.dao.UserDaoImpl;
import com.xworkz.userapp.dto.UserDto;

import java.util.Collections;
import java.util.List;

public class UserServiceImpl implements  UserService{

    UserDao userDao=new UserDaoImpl();
    @Override
    public boolean addUser(UserDto userDto) {
        boolean firstNameValid = false;
        boolean lastNameValid = false;
        boolean userSave=false;

        if (userDto != null) {
            if (userDto.getFirstName()!= null && !userDto.getLastName().isEmpty()) {
                System.out.println("User name valid");
                firstNameValid = true;
            }
            if (userDto.getLastName() != null && !userDto.getLastName().isEmpty()) {
                System.out.println("user last name valid");
               lastNameValid = true;
            }
        }


        if (firstNameValid==true && lastNameValid==true)
            userSave= userDao.addUser(userDto);

    return  userSave;

    }

    @Override
    public UserDto getUserById(int id) {
        if (id > 0) {
            return userDao.getUserById(id);
        }
        return  null;
    }

    @Override
    public UserDto getUserByName(String firstName) {
        if(firstName!=null && !firstName.isEmpty())
            return  userDao.getUserByName(firstName);
        return  null;
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public boolean deleteUserById(int id) {
        return userDao.deleteUserById(id);
    }

    @Override
    public void updateUser(UserDto userDto) {
         userDao.updateUser(userDto);
    }

}
