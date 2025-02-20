package com.xworkz.app.service;

import com.xworkz.app.dto.UserDto;
import org.springframework.web.multipart.MultipartFile;

public interface UserService {
    public boolean save(UserDto userDto);
    UserDto getUserByEmailAndPassword(String email,String password);
    boolean updatePasswordByEmail(String email, String newPassword);

    boolean validateOtp(String otp, String email);

    UserDto updateProfile(UserDto mediSaleDto, UserDto sessionDto, MultipartFile multipartFile);
    public UserDto getUserById(Integer id);
}
