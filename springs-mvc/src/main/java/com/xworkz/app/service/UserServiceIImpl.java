package com.xworkz.app.service;

import com.xworkz.app.Repositry.UserRepository;
import com.xworkz.app.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserServiceIImpl implements UserService{
    @Autowired
    UserRepository userRepository;
    @Override
    public boolean validateAndSave(UserDto dto) {
        return userRepository.validateAndSave(dto) ;
    }

    @Override
    public List<UserDto> getallUser() {
        return userRepository.getallUser();
    }

    @Override
    public void deleteUserById(int id) {
         userRepository.deleteUserById(id);
    }

    @Override
    public UserDto getUserById(int id) {
        return userRepository.getUserById(id);
    }

    @Override
    public void updateUser(UserDto userDto) {
        userRepository.updateUser(userDto);
    }
}