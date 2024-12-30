package com.xworkz.employee.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "employee_details")
@NamedQueries({
@NamedQuery(name = "getAllDetails",query = "select user from EmployeeDto user"),
@NamedQuery(name = "DeleteUserById",query = "delete from EmployeeDto dto where dto.id =: id"),
@NamedQuery(name = "getNameByEducation",query = "select user.name from EmployeeDto user where user.education =: education"),
@NamedQuery(name = "getSalaryByName",query = "select user.salary from EmployeeDto user where user.name =: name"),
@NamedQuery(name = "getSalaryEducationByName",query = "select user.salary, user.education from EmployeeDto user where user.name=:name"),
@NamedQuery(name = "updateSalaryByEducation",query = "update EmployeeDto dto set dto.salary =: salary where dto.education =: education"),
@NamedQuery(name = "deleteEmployeeBySalary",query = "delete EmployeeDto dto where dto.salary =: salary")
})
public class EmployeeDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "education")
    private String education;
    @Column(name = "salary")
    private double salary;
}
