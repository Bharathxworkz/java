package com.xworkz.app.repository;

import com.xworkz.app.entity.UserEntity;

public interface UserRepository {
    public boolean save(UserEntity userEntity);
    boolean checkEmail(String email);
    UserEntity getUserByEmailAndPassword(String email);

    boolean checkPhoneNumber(long mobile);
    UserEntity getUserByEmail(String email);

    UserEntity updateProfile(UserEntity userEntity);

    UserEntity getDtoByEmail(String email);

    UserEntity getUserById(Integer id);
}
