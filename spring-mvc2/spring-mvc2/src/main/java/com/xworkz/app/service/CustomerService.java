package com.xworkz.app.service;

import com.xworkz.app.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    boolean save(CustomerDto dto);
    List<CustomerDto> getAllUsers();
    boolean deleteCustomer(int id);
    CustomerDto getUserById(int id);
    void updateUser(CustomerDto dto);
}
