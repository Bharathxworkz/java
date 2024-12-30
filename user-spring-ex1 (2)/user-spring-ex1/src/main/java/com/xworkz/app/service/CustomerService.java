package com.xworkz.app.service;

import com.xworkz.app.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    boolean validateAndSave(CustomerDto userDto);
    CustomerDto getUserById(int id);
    CustomerDto getUserByName(String name);
    List<CustomerDto> getAllUsers();
    boolean deleteUserById(int id);
    public void updateUser(String name, int id);

}
