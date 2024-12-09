package com.xworkz.userapp.dao;

import com.xworkz.userapp.dto.UserDto;

public interface UserDao {
    boolean addUser(UserDto userDto);
    public UserDto detailsByid(int id) ;
public  UserDto detailsBymail(String email);
}
