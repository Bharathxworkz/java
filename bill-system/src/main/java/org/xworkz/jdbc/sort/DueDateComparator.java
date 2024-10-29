package org.xworkz.jdbc.sort;

import org.xworkz.jdbc.BillDto;

import java.util.Comparator;

public class DueDateComparator implements Comparator<BillDto> {

    @Override
    public int compare(BillDto o1, BillDto o2) {
        return o1.getDueDate().compareTo(o2.getDueDate());
    }
}
