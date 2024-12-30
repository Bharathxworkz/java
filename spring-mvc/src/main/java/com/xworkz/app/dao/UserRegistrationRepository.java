package com.xworkz.app.dao;

import com.xworkz.app.dto.UserDto;

import java.util.List;

public interface UserRegistrationRepository {
    public boolean createUser(UserDto userDto);
    List<UserDto> getAllUsers();
    boolean deleteUserById(int id);
    UserDto getUserById(int id);
    void updateUser(UserDto userDto);

}
