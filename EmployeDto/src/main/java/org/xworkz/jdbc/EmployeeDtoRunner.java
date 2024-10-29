package org.xworkz.jdbc;

import org.xworkz.jdbc.sort.DepartmentComparator;
import org.xworkz.jdbc.sort.IdComparator;
import org.xworkz.jdbc.sort.NameComparator;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeDtoRunner {
    public static void main(String[] args) {

        List<EmployeeDto> collection = new ArrayList<>();

        EmployeeDto employeeDto = new EmployeeDto(1, "Aarav", 22000, "Finance");
        EmployeeDto employeeDto1 = new EmployeeDto(2, "Nisha", 45000, "Operations");
        EmployeeDto employeeDto2 = new EmployeeDto(3, "Varun", 60000, "IT");
        EmployeeDto employeeDto3 = new EmployeeDto(4, "Kavya", 35000, "Human Resources");
        EmployeeDto employeeDto4 = new EmployeeDto(5, "Suresh", 27000, "Logistics");
        EmployeeDto employeeDto5 = new EmployeeDto(6, "Meena", 55000, "Marketing");
        EmployeeDto employeeDto6 = new EmployeeDto(7, "Aditi", 48000, "Consulting");
        EmployeeDto employeeDto7 = new EmployeeDto(8, "Rohan", 38000, "Design");
        EmployeeDto employeeDto8 = new EmployeeDto(9, "Tara", 32000, "Research");
        EmployeeDto employeeDto9 = new EmployeeDto(10, "Vikram", 150000, "Development");

        collection.add(employeeDto);
        collection.add(employeeDto1);
        collection.add(employeeDto2);
        collection.add(employeeDto5);
        collection.add(employeeDto4);
        collection.add(employeeDto3);
        collection.add(employeeDto6);
        collection.add(employeeDto7);
        collection.add(employeeDto8);
        collection.add(employeeDto9);
        Collections.sort(collection );
        System.out.println(collection.stream().
                sorted(Comparator.comparing(EmployeeDto ::getSalary ).
                        thenComparing(EmployeeDto::getName)).
                collect(Collectors.toList())
        );
        // Retrieve and display data
        for(EmployeeDto details : collection){
            System.out.println("The details are: " + details);
        }

        // Comparator sorting
       System.out.println("Sorting by Department:");
        Collections.sort(collection,new DepartmentComparator());
        Iterator<EmployeeDto> iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
     /*
        System.out.println("Sorting by ID:");
        collection.sort(new IdComparator());
        collection.forEach(System.out::println);

        System.out.println("Sorting by Name:");
        collection.sort(new NameComparator());
        for (EmployeeDto detail : collection){
            System.out.println(detail);
        }

        System.out.println("Sorting by Salary:");
        collection.forEach(System.out::println);

      */

    }
}
