package com.xworkz.app.dao;


import com.xworkz.app.dto.UserDto;

import java.util.List;

public interface UserDao {
    boolean save(UserDto userDto);

    UserDto getUserById(int id);

    UserDto getUserByName(String name);

    List<UserDto> getAllUsers();
    boolean deleteUserById(int id);
    void updateUser(String name, int id);




}
