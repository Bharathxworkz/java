package com.xworkz.employee.runner;

import com.xworkz.employee.config.ESpringConfiguration;
import com.xworkz.employee.dto.EmployeeDto;
import com.xworkz.employee.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class EmployeeRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ESpringConfiguration.class);

        EmployeeDto employeeDto = new EmployeeDto();
        EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);

        //valid and save
        employeeDto.setName("Latha");
        employeeDto.setEducation("BBM");
        employeeDto.setSalary(19000.0);
        employeeService.validandSave(employeeDto);
        System.out.println("Added successfully");

        //get by id
        EmployeeDto getbyId = employeeService.getUserById(1);
        System.out.println(getbyId);

        //get all the details;
        List<EmployeeDto> employeeDtos = employeeService.getAllDetails(employeeDto);
        System.out.println(employeeDtos);

        //update the details by id;
        EmployeeDto updateValue = new EmployeeDto();
        updateValue.setName("Mary");
        updateValue.setEducation("BCA");
        updateValue.setSalary(25000.0);
        employeeService.updateUserById(2,updateValue);
        System.out.println("Updated successfully...!!");

        //delete operation;
        employeeService.DeleteUserById(5);
        System.out.println("Row deleted");

        //getNameByEducation
        String education = "BCA";
        String name = employeeService.getNameByEducation(education);
        System.out.println("The name for the education "+education+" is"+name);

        //getSalaryByName
        name = "Mary";
        double salary = employeeService.getSalaryByName(name);
        System.out.println("The salary for the name of: "+name+" is "+salary);

        //getSalaryEducationByName
        System.out.println("get Salary and Education By Name");
        Object [] obj = employeeService.getSalaryEducationByName("Mary");
        Arrays.stream(obj).forEach(System.out::println);

        //updateSalaryByEducation
        boolean updated = employeeService.updateSalaryByEducation("BCA",20000.0);
        System.out.println("Is salary updated :"+updated);

        //deleteEmployeeBySalary
        boolean deleted = employeeService.deleteEmployeeBySalary(20000.0);
        System.out.println("Is deleted: "+deleted);
    }
}
