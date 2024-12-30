package com.xworkz.userapp.service;

import com.xworkz.userapp.dto.UserDto;
import com.xworkz.userapp.repository.UserRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

@Service
public class UserRegistrationServiceImpl implements  UserRegistrationService{


    @Autowired
    UserRegistrationRepository userRegistrationRepository;
    @Override
    public boolean save(UserDto userDto) {
        boolean userValid = false;
        boolean isUserFirstNameValid = false;
        boolean isUserLastNameValid = false;
        if (userDto != null) {
            if (userDto.getFirstName() != null && !userDto.getFirstName().isEmpty()) {
                isUserFirstNameValid = true;

            }
            if (userDto.getLastName() != null && !userDto.getLastName().isEmpty()) {
                isUserLastNameValid = true;

            }
        }
            if (isUserFirstNameValid == true && isUserLastNameValid==true) {
                userValid = userRegistrationRepository.save(userDto);
            }

        return userValid;
    }

    @Override
    public List<UserDto> getAllUsers() {
        return  userRegistrationRepository.getAllUsers();
    }

    @Override
    public boolean deleteUserById(int id) {

     return userRegistrationRepository.deleteUserById(id);
    }

    @Override
    public UserDto getUserById(int id) {
        return  userRegistrationRepository.getUserById(id);
    }

    @Override
    public void updateUser(UserDto userDto) {
        userRegistrationRepository.updateUser(userDto);

    }

}
