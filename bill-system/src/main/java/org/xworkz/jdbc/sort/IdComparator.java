package org.xworkz.jdbc.sort;

import org.xworkz.jdbc.BillDto;

import java.util.Comparator;

public class IdComparator implements Comparator<BillDto> {


    @Override
    public int compare(BillDto o1, BillDto o2) {
        return o1.getId() - o2.getId();
    }
}
