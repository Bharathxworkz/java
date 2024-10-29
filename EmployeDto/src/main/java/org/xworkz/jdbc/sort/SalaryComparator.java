package org.xworkz.jdbc.sort;

import org.xworkz.jdbc.EmployeeDto;

import java.util.Comparator;

public class SalaryComparator implements Comparator<EmployeeDto> {
    @Override
    public int compare(EmployeeDto o1, EmployeeDto o2) {
        return (int)(o1.getSalary() - o2.getSalary());
    }
}
