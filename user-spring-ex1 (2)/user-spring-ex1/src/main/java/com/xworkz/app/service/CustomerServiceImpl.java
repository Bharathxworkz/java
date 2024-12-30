package com.xworkz.app.service;

import com.xworkz.app.dao.CustomerDaoImpl;
import com.xworkz.app.dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDaoImpl dao;

    @Override
    public boolean validateAndSave(CustomerDto userDto) {

        boolean userValid = false;
        boolean isUserNameValid = false;
        if(userDto != null){
            if(userDto.getCustomerName() != null  && !userDto.getCustomerName().isEmpty()){
                isUserNameValid = true;
            }
            if(isUserNameValid == true){
                userValid = dao.save(userDto);
            }
        }
        return userValid;
    }

    @Override
    public CustomerDto getUserById(int id) {
        return dao.getUserById(id);
    }

    @Override
    public CustomerDto getUserByName(String name) {
        return dao.getUserByName(name);
    }

    @Override
    public List<CustomerDto> getAllUsers() {
        return dao.getAllUsers();
    }

    @Override
    public boolean deleteUserById(int id) {
        return dao.deleteUserById(id);
    }

    @Override
    public void updateUser(String name, int id) {
        dao.updateUser(name, id);
    }


}
