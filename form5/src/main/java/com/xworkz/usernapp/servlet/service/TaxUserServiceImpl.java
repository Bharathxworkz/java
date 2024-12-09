package com.xworkz.usernapp.servlet.service;

import com.xworkz.usernapp.servlet.dao.TaxUserDao;
import com.xworkz.usernapp.servlet.dao.TaxUserDaoImpl;
import com.xworkz.usernapp.servlet.dto.TaxUserDto;

import java.util.Collections;
import java.util.List;

import static javafx.beans.binding.Bindings.isEmpty;
public class TaxUserServiceImpl implements TaxUserService {
    TaxUserDao taxUserDao = new TaxUserDaoImpl();

    @Override
    public boolean addTaxUser(TaxUserDto taxUserDto) {
        boolean fNameValid = false;
        boolean lNameValid = false;

        if (taxUserDto != null) {
            if (taxUserDto.getFName() != null && !taxUserDto.getFName().isEmpty()) {
                fNameValid = true;
            }
            if (taxUserDto.getLName() != null && !taxUserDto.getLName().isEmpty()) {
                lNameValid = true;
            }
        }

        if (fNameValid && lNameValid) {
            return taxUserDao.addTaxUser(taxUserDto);
        }
        return false;
    }

    @Override
    public TaxUserDto getTaxUserById(int id) {
        if (id > 0) {
            return taxUserDao.getTaxUserById(id);
        }
        return null;

    }

    @Override
    public List<TaxUserDto> getAllUser() {
        return  taxUserDao.getAllUser();
    }

   @Override
   public boolean deleteUserById(int id) {
      return  taxUserDao.deleteUserById(id);
   }

   @Override
  public void updateUser(TaxUserDto taxUserDto) {
        taxUserDao.updateUser(taxUserDto);

   }
}



