package com.xworks.formsystem.servlets.dao;

import com.xworks.formsystem.servlets.dto.FormDto;

import java.util.List;

public interface FormDao {
    boolean addForm(FormDto dto);
    FormDto getUserById(int id);
    List<FormDto> getAllUsers();
    FormDto getUserFormbyFirstname(String firstName);
    boolean deleteUserById(int id);
    void updateUser(FormDto dto);
}
