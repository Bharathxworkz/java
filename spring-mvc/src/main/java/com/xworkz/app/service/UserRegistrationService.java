package com.xworkz.app.service;

import com.xworkz.app.dto.UserDto;

import java.util.List;

public interface UserRegistrationService {
    public boolean save(UserDto userDto);
    List<UserDto> getAllUsers();
    boolean deleteUserById(int id);
    UserDto getUserById(int id);
    void updateUser(UserDto dto);
}
