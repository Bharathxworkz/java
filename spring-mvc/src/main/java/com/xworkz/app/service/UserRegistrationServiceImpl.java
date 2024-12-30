package com.xworkz.app.service;

import com.xworkz.app.dao.UserRegistrationRepository;
import com.xworkz.app.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService{
    public UserRegistrationServiceImpl(){
        System.out.println("UserRegistrationServiceImpl started");
    }
    @Autowired
    UserRegistrationRepository registrationRepository;
    @Override
    public boolean save(UserDto userDto) {
        boolean isValid = false;
        boolean isSaved = false;
        if (userDto != null) {
            isValid = true;
        }
        if (isValid = true) {
            isSaved = registrationRepository.createUser(userDto);
        }
        return isSaved;
    }

    @Override
    public List<UserDto> getAllUsers() {
        return registrationRepository.getAllUsers();
    }

    @Override
    public boolean deleteUserById(int id) {
        return registrationRepository.deleteUserById(id);
    }

    @Override
    public UserDto getUserById(int id) {
        return registrationRepository.getUserById(id);
    }

    @Override
    public void updateUser(UserDto dto) {
        registrationRepository.updateUser(dto);
    }
}
