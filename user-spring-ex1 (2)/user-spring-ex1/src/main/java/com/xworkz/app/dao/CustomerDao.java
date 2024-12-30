package com.xworkz.app.dao;


import com.xworkz.app.dto.CustomerDto;

import java.util.List;

public interface CustomerDao {
    boolean save(CustomerDto userDto);

    CustomerDto getUserById(int id);

    CustomerDto getUserByName(String name);

    List<CustomerDto> getAllUsers();
    boolean deleteUserById(int id);
    void updateUser(String name, int id);




}
