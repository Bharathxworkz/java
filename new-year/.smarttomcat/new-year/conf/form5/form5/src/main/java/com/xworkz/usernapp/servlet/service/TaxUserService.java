package com.xworkz.usernapp.servlet.service;

import com.xworkz.usernapp.servlet.dto.TaxUserDto;

import java.util.List;

public interface TaxUserService {
    boolean addTaxUser(TaxUserDto taxUserDto);

    TaxUserDto getTaxUserById(int id);

    List<TaxUserDto> getAllUser();

  boolean deleteUserById(int id);
//
  public  void updateUser(TaxUserDto taxUserDto);

   // List<TaxUserDto> getAllUsers();
}
