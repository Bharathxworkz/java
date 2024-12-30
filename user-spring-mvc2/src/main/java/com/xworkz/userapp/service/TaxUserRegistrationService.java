package com.xworkz.userapp.service;

import com.xworkz.userapp.dto.TaxUserDto;

import java.util.List;

public interface TaxUserRegistrationService {

    boolean save(TaxUserDto taxUserDto);

    List<TaxUserDto> getAllTaxUsers();

    boolean deleteTaxUserById(int id);

    public TaxUserDto getTaxUserById(int id);

    public void updateTaxUser(TaxUserDto taxUserDto);
}
