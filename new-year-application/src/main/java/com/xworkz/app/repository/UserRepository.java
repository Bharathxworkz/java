package com.xworkz.app.repository;

import com.xworkz.app.dto.UserDto;
import com.xworkz.app.entity.UserEntity;

import java.util.List;

public interface UserRepository {

    boolean save(UserEntity entity);

    UserEntity getUserByEmailAndPassword(String email);

   // void updatePasswordByEmail(String email, String newPassword,String confirmPassword);

    boolean checkEmail(String email);

    UserEntity getDtoByEmail(String email);

    UserEntity getUserById(Integer id);

    UserEntity updateProfile(UserEntity userEntity);
     List<UserDto> findAll() ;

    boolean checkPhoneNumber(Long contactNumber);

}
