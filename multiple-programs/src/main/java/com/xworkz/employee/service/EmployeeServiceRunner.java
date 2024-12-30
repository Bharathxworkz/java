package com.xworkz.employee.service;

import com.xworkz.employee.dao.EmployeeDao;
import com.xworkz.employee.dto.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeServiceRunner implements EmployeeService{

    @Autowired
    private EmployeeDao employeeDao;
    boolean isvalidated = false;

    @Override
    public boolean validandSave(EmployeeDto employeeDto) {
        if(employeeDto !=null){
            if(employeeDto.getName() != null && !employeeDto.getName().isEmpty()){
                System.out.println("Name validated");
                employeeDao.save(employeeDto);
                isvalidated = true;
            }
        }
        return isvalidated;
    }

    @Override
    public EmployeeDto getUserById(int id) {
        return employeeDao.getUserById(id);
    }

    @Override
    public List<EmployeeDto> getAllDetails(EmployeeDto employeeDto) {
        return employeeDao.getAllDetails(employeeDto);
    }

    @Override
    public void updateUserById(int id, EmployeeDto newUserData) {
        employeeDao.updateUserById(id,newUserData);
    }

    @Override
    public boolean DeleteUserById(int id) {
        return employeeDao.DeleteUserById(id);
    }

    @Override
    public String getNameByEducation(String education) {
        return employeeDao.getNameByEducation(education);
    }

    @Override
    public double getSalaryByName(String name) {
        return employeeDao.getSalaryByName(name);
    }

    @Override
    public Object[] getSalaryEducationByName(String name) {
        Object [] obj = employeeDao.getSalaryEducationByName(name);
        return obj;
    }

    @Override
    public boolean updateSalaryByEducation(String education, double salary) {
        return employeeDao.updateSalaryByEducation(education,salary);
    }

    @Override
    public boolean deleteEmployeeBySalary(double salary) {
        return employeeDao.deleteEmployeeBySalary(salary);
    }
}
