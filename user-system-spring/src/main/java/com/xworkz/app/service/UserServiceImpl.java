package com.xworkz.app.service;

import com.xworkz.app.Exception.EmailNotFoundException;
import com.xworkz.app.dao.UserDao;
import com.xworkz.app.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public boolean validateAndSave(UserDto userDto) {
        if (isValidUser(userDto)) {
            return userDao.save(userDto);
        }
        return false;
    }

    private boolean isValidUser(UserDto userDto) {
        if (userDto == null) {
            return false;
        }
        if (userDto.getUserName() == null || userDto.getUserName().isEmpty()) {
            return false;
        }
        return true;
    }

    @Override
    public String getEmailById(int id) {
        String str = userDao.getEmailById(id);
        if (str != null && !str.isEmpty()) {
            return str;
        }
        else {
            EmailNotFoundException  emailNotFoundException= new EmailNotFoundException("Email not found");
           throw  emailNotFoundException;
        }

    }


    @Override
    public Object[] getNameAndEmailById(int id) {
        return userDao.getNameAndEmailById(id);
    }

    @Override
    public Object[] getNameandAgeBYAdhar(long AdharNo) {
        return userDao.getNameandAgeBYAdhar(AdharNo);
    }

    @Override
    public boolean updateNameByAdharNo(String userName, long AdharNo) {
        return userDao.updateNameByAdharNo(userName, AdharNo);
    }

    @Override
    public boolean deleteById(int id) {
        return userDao.deleteById( id);
    }

    @Override
    public boolean updareNmaeByid(String userName, int id) {
        return userDao.updareNmaeByid(userName, id);
    }

    @Override
    public String getNameBYId(int id) {
        return  userDao.getNameBYId(id);
    }

    @Override
    public String getAddressById(int id) {
        return userDao.getAddressById( id);
    }

    @Override
    public Object[] getAdharNoandNameById(int id) {
        return userDao.getAdharNoandNameById(id);
    }


}
