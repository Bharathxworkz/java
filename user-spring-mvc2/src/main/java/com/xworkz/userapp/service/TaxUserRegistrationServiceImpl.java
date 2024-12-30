package com.xworkz.userapp.service;

import com.xworkz.userapp.dto.TaxUserDto;
import com.xworkz.userapp.repository.TaxUserRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service
public class TaxUserRegistrationServiceImpl implements  TaxUserRegistrationService{
    @Autowired
    TaxUserRegistrationRepository taxUserRegistrationRepository;
    @Override
    public boolean save(TaxUserDto taxUserDto) {
        boolean userValid = false;
        boolean isUserFirstNameValid = false;
        boolean isUserLastNameValid = false;
        if (taxUserDto != null) {
            if (taxUserDto.getFirstName() != null && !taxUserDto.getFirstName().isEmpty()) {
                isUserFirstNameValid = true;

            }
            if (taxUserDto.getLastName() != null && !taxUserDto.getLastName().isEmpty()) {
                isUserLastNameValid = true;

            }
        }
        if (isUserFirstNameValid == true && isUserLastNameValid==true) {
            userValid = taxUserRegistrationRepository.save(taxUserDto);
        }

        return userValid;
    }

    @Override
    public List<TaxUserDto> getAllTaxUsers() {
        return  taxUserRegistrationRepository.getAllTaxUsers();
    }

    @Override
    public boolean deleteTaxUserById(int id) {
        return taxUserRegistrationRepository.deleteTaxUserById(id);
    }

    @Override
    public TaxUserDto getTaxUserById(int id) {
        return  taxUserRegistrationRepository.getTaxUserById(id);
    }

    @Override
    public void updateTaxUser(TaxUserDto taxUserDto) {
        taxUserRegistrationRepository.updateTaxUser(taxUserDto);

    }
}
