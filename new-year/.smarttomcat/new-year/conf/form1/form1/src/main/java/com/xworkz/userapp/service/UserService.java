package com.xworkz.userapp.service;

import com.xworkz.userapp.dto.UserDto;

import java.util.List;

public interface UserService {

    boolean addUser(UserDto userDto);

    UserDto getUserById(int id);

    UserDto getUserByName(String firstName);
    List<UserDto> getAllUsers();

    boolean deleteUserById(int id);

    public  void updateUser(UserDto userDto);
}

