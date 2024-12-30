package com.xworkz.app.service;

import com.xworkz.app.dto.CustomerDto;
import com.xworkz.app.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    public CustomerServiceImpl(){
        System.out.println("CustomerServiceImpl started");
    }

    @Autowired
    private CustomerRepository repository;

    @Override
    public boolean save(CustomerDto dto) {
        boolean isFirstNameValid=false;
        boolean isPhoneNumberValid = false;
        boolean isAgeValid= false;
        boolean isSaved = false;
        if (dto!=null){
            if (dto.getFirstName()!=null && !dto.getFirstName().isEmpty()){
                isFirstNameValid = true;
            }
            if (dto.getPhoneNumber()>1000000000){
                isPhoneNumberValid = true;
            }
            if (dto.getAge()>0){
                isAgeValid = true;
            }
            if (isFirstNameValid == true && isPhoneNumberValid == true && isAgeValid == true){
                isSaved = repository.save(dto);
            }
        }
        return false;
    }

    @Override
    public List<CustomerDto> getAllUsers() {
        return repository.getAllUsers();
    }

    @Override
    public boolean deleteCustomer(int id) {
        return repository.deleteCustomer(id);
    }

    @Override
    public CustomerDto getUserById(int id) {
        return repository.getUserById(id);
    }

    @Override
    public void updateUser(CustomerDto dto) {
        repository.updateUser(dto);
    }
}
