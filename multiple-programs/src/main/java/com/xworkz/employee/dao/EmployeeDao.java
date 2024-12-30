package com.xworkz.employee.dao;

import com.xworkz.employee.dto.EmployeeDto;

import java.util.List;

public interface EmployeeDao {

    boolean save(EmployeeDto employeeDto);

    EmployeeDto getUserById(int id);

    List<EmployeeDto> getAllDetails(EmployeeDto employeeDto);

    void updateUserById(int id, EmployeeDto newUserData);

    boolean DeleteUserById(int id);

    String getNameByEducation(String education);

    double getSalaryByName(String name);

    Object [] getSalaryEducationByName(String name);

    boolean updateSalaryByEducation(String education,double salary);

    boolean deleteEmployeeBySalary(double salary);
}
