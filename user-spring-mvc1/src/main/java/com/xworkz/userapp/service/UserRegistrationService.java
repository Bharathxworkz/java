package com.xworkz.userapp.service;

import com.xworkz.userapp.dto.UserDto;

import java.util.List;

public interface UserRegistrationService {
    boolean save(UserDto userDto);

    List<UserDto> getAllUsers();
    boolean deleteUserById(int id);


    public UserDto getUserById(int id);
    public void updateUser(UserDto userDto);
}
