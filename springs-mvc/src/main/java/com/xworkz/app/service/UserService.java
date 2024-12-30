package com.xworkz.app.service;

import com.xworkz.app.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    boolean validateAndSave(UserDto dto);

    List<UserDto> getallUser();

    void deleteUserById(int id);

    UserDto getUserById(int id);

    void updateUser(UserDto userDto);
}
