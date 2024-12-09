package com.xworkz.userapp.service;

import com.xworkz.userapp.dto.CustomerDto;

public interface CustomerService {
    public boolean validateAndSaveUser(CustomerDto customerDto);
}
