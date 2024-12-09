package com.xworkz.userapp.service;

import com.xworkz.userapp.dao.UserDao;
import com.xworkz.userapp.dao.UserDaoImpl;
import com.xworkz.userapp.dto.UserDto;

public class UserServiceImpl implements UserService {
    private final UserDao userDao = new UserDaoImpl();

    @Override
    public boolean validateAndSaveUser(UserDto dto) {
        if (dto == null) {
            System.out.println("UserDto is null, cannot proceed.");
            return false;
        }

        return userDao.addUser(dto);
    }

    @Override
    public UserDto detailsByid(int id) {
        return userDao.detailsByid(id);
    }

    @Override
    public UserDto detailsBymail(String email) {

        return userDao.detailsBymail(email);
    }
}
