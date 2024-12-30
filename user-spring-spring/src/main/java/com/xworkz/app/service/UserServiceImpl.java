package com.xworkz.app.service;

import com.xworkz.app.dao.UserDaoImpl;
import com.xworkz.app.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDaoImpl dao;

    @Override
    public boolean validateAndSave(UserDto userDto) {

        boolean userValid = false;
        boolean isUserNameValid = false;
        if(userDto != null){
            if(userDto.getName() != null  && !userDto.getName().isEmpty()){
                isUserNameValid = true;
            }
            if(isUserNameValid == true){
                userValid = dao.save(userDto);
            }
        }
        return userValid;
    }

    @Override
    public UserDto getUserById(int id) {
        return dao.getUserById(id);
    }

    @Override
    public UserDto getUserByName(String name) {
        return dao.getUserByName(name);
    }

    @Override
    public List<UserDto> getAllUsers() {
        return dao.getAllUsers();
    }

    @Override
    public boolean deleteUserById(int id) {
        return dao.deleteUserById(id);
    }

    @Override
    public void updateUser(String name, int id) {
        dao.updateUser(name, id);
    }


}
