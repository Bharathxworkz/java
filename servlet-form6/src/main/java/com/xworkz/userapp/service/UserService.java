package com.xworkz.userapp.service;

import com.xworkz.userapp.dto.UserDto;

public interface UserService {
    boolean validateAndSaveUser(UserDto dto);
}
