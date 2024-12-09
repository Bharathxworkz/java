package com.xworks.formsystem.servlets.service;

import com.xworks.formsystem.servlets.dao.FormDao;
import com.xworks.formsystem.servlets.dao.FormDaoImpl;
import com.xworks.formsystem.servlets.dto.FormDto;

import java.util.Collections;
import java.util.List;

public class FormServiceImpl implements FormService {
    FormDao formDao = new FormDaoImpl();

    @Override
    public boolean addForm(FormDto dto) {
        boolean firstNameValid = false;
        boolean lastNameValid = false;
        boolean userStored = false;
        if ((dto != null)) {
            if (dto.getFirstName() != null && !dto.getLastName().isEmpty()) {
                System.out.println("User First Name validated");
                firstNameValid = true;
            }
            if (dto.getLastName() != null && !dto.getLastName().isEmpty()) {
                System.out.println("User Last Name validated");
                lastNameValid = true;
            }
        }
        if (firstNameValid == true && lastNameValid == true)
            userStored = formDao.addForm(dto);
        return userStored;
    }

    @Override
    public FormDto getUserById(int id) {
        return formDao.getUserById(id);
    }

    @Override
    public FormDto getUserFormbyFirstname(String firstName) {
        return formDao.getUserFormbyFirstname(firstName);
    }

    @Override
    public List<FormDto> getAllForm() {
        return formDao.getAllUsers();
    }

    @Override
    public boolean deleteUserById(int id) {
        if(id>0)
            return formDao.deleteUserById(id);
        return false;
    }

    @Override
    public void updateUser(FormDto dto) {
        formDao.updateUser(dto);
    }


}
