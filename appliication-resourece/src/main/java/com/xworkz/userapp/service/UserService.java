package com.xworkz.userapp.service;

import com.xworkz.userapp.dto.UserDto;

public interface UserService {
    boolean validateAndSaveUser(UserDto dto);
    public UserDto detailsByid(int id) ;
    public  UserDto detailsBymail(String email);
}
