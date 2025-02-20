package com.xworkz.app.service;

import com.xworkz.app.dto.UserDto;
import com.xworkz.app.entity.UserEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface Userservice {
    boolean save(UserDto userDto);

    UserDto getUserByEmailAndPassword(String email,String password);
    boolean updatePasswordByEmail(String email, String newPassword);

    UserEntity getDtoByEmail(String email);

    UserDto getUserById(Integer id);

    UserDto updateProfile(UserDto userDto, UserDto sessionDto, MultipartFile multipartFile);
    public List<UserDto> findAll();
    boolean validateOtp(String otp, String email);

}
