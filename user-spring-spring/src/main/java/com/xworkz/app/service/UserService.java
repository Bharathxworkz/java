package com.xworkz.app.service;

import com.xworkz.app.dao.UserDaoImpl;
import com.xworkz.app.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserService {
    boolean validateAndSave(UserDto userDto);
    UserDto getUserById(int id);
    UserDto getUserByName(String name);
    List<UserDto> getAllUsers();
    boolean deleteUserById(int id);
    public void updateUser(String name, int id);

}
