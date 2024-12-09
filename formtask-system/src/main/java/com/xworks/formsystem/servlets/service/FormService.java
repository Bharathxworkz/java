package com.xworks.formsystem.servlets.service;

import com.xworks.formsystem.servlets.dto.FormDto;

import java.util.List;

public interface FormService {

    boolean addForm(FormDto dto);
    FormDto getUserById(int id);
    FormDto getUserFormbyFirstname(String firstName);
   List<FormDto>getAllForm();
    boolean deleteUserById(int id);

    void updateUser(FormDto dto);
}
