package org.xworkz.jdbc;

import org.xworkz.jdbc.sort.DueDateComparator;
import org.xworkz.jdbc.sort.IdComparator;
import org.xworkz.jdbc.sort.IssueDateComparator;
import org.xworkz.jdbc.sort.PriceComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BillDtoRunner {
    public static void main(String[] args) {

        List<BillDto> bills = new ArrayList<>();

        BillDto bill = new BillDto(1, "10/06/24", "10/07/24", 15000.0);
        BillDto bill1 = new BillDto(2, "12/04/24", "12/05/24", 12000.0);
        BillDto bill2 = new BillDto(3, "20/03/24", "20/04/24", 30000.0);
        BillDto bill3 = new BillDto(4, "25/01/24", "25/02/24", 18000.0);
        BillDto bill4 = new BillDto(5, "08/08/24", "08/09/24", 250000.0);
        BillDto bill5 = new BillDto(6, "15/09/24", "15/10/24", 9000.0);

        bills.add(bill5);
        bills.add(bill3);
        bills.add(bill4);
        bills.add(bill1);
        bills.add(bill);
        bills.add(bill2);

        // To retrieve the data:
        bills.sort(new IdComparator());
        System.out.println("Sorting by ID:");
        bills.forEach(System.out::println);

        System.out.println("Sorting by Issue Date:");
        bills.sort(new IssueDateComparator());
        bills.forEach(System.out::println);

        System.out.println("Sorting by Due Date:");
        bills.sort(new DueDateComparator());
        bills.forEach(System.out::println);

        System.out.println("Sorting by Amount:");
        bills.sort(new PriceComparator());
        for (BillDto allBills : bills) {
            System.out.println(allBills);
        }
    }
}
