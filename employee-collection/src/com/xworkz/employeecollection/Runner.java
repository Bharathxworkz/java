package com.xworkz.employeecollection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {

        List<EmployeeDto> collection = new ArrayList<>();

        EmployeeDto employeeDto = new EmployeeDto(1, "Ramesh", 80000);
        EmployeeDto employeeDto1 = new EmployeeDto(2, "Laali", 21000);
        EmployeeDto employeeDto2 = new EmployeeDto(3, "Suresh", 30000);
        EmployeeDto employeeDto3 = new EmployeeDto(4, "Maaya", 55000);
        EmployeeDto employeeDto4 = new EmployeeDto(5, "Kanasu", 33000);
        EmployeeDto employeeDto5 = new EmployeeDto(6, "Bharbav", 20000);
        EmployeeDto employeeDto6 = new EmployeeDto(7, "Bhoomi", 22000);
        EmployeeDto employeeDto7 = new EmployeeDto(8, "Suresh", 15000);
        EmployeeDto employeeDto8 = new EmployeeDto(9, "Babu", 60000);
        EmployeeDto employeeDto9 = new EmployeeDto(10, "Latha", 65000);
        EmployeeDto employeeDto10 = new EmployeeDto(11, "Bhanu", 25000);
        EmployeeDto employeeDto11 = new EmployeeDto(12, "Amitha", 10000);

        collection.add(employeeDto);
        collection.add(employeeDto1);
        collection.add(employeeDto2);
        collection.add(employeeDto3);
        collection.add(employeeDto4);
        collection.add(employeeDto5);
        collection.add(employeeDto6);
        collection.add(employeeDto7);
        collection.add(employeeDto8);
        collection.add(employeeDto9);
        collection.add(employeeDto10);
        collection.add(employeeDto11);

        collection.forEach(System.out::println);

        System.out.println(collection.stream()
                .sorted(Comparator.comparing(EmployeeDto::getSalary).reversed())
                .collect(Collectors.toList()));


        List<Double> distinctSalaries = new ArrayList<>();
        collection.stream()
                .sorted(Comparator.comparing(EmployeeDto::getSalary).reversed())
                .forEach(employee -> {
                    if (!distinctSalaries.contains(employee.getSalary())) {
                        distinctSalaries.add(employee.getSalary());
                    }
                });

        Double secondHighestSalary = (distinctSalaries.size() > 1) ? distinctSalaries.get(1) : null;
        System.out.println("Second Highest Salary: " + secondHighestSalary);

        List<EmployeeDto> salaryGreaterThan25000 = collection.stream()
                .filter(e -> e.getSalary() > 25000)
                .collect(Collectors.toList());

        System.out.println("Employees with salary greater than 25000: " + salaryGreaterThan25000);

        List<EmployeeDto> startsWithB = collection.stream()
                .filter(e -> e.getName().startsWith("B"))
                .collect(Collectors.toList());

        System.out.println("Employees whose names start with 'B': " + startsWithB);

        Set<String> duplicateNames = new HashSet<>();
        Set<String> allNames = new HashSet<>();

        collection.forEach(e -> {
            if (!allNames.add(e.getName())) {
                duplicateNames.add(e.getName());
            }
        });

        System.out.println("Duplicate employee names: " + duplicateNames);
    }
}
