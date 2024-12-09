package com.xworkz.userapp.service;

import com.xworkz.userapp.dao.CustomerDao;
import com.xworkz.userapp.dao.CustomerDaoImpl;
import com.xworkz.userapp.dto.CustomerDto;

public class CustomerServiceImpl implements CustomerService{
    CustomerDao customerDao = new CustomerDaoImpl();
    @Override
    public boolean validateAndSaveUser(CustomerDto customerDto) {
        boolean customerNameValid = false;
        boolean customerDateOfBirthValid = false;
        boolean customerSaved = false;

        if ((customerDto!=null)){
            if(customerDto.getGivenName() != null && customerDto.getGivenName() != null ){
                System.out.println("Customer name validated");
                customerNameValid = true;
            }
            if(customerDto.getDob() != null && customerDto.getDob() != null ){
                System.out.println("Customer Date Of Birth validated");
                customerDateOfBirthValid = true;
            }
        }
        if( customerNameValid == true && customerDateOfBirthValid == true)
            customerSaved =  customerDao.addCustomer(customerDto);
        return customerSaved;
    }
}
