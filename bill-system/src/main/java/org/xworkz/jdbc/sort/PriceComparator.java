package org.xworkz.jdbc.sort;

import org.xworkz.jdbc.BillDto;

import java.util.Comparator;

public class PriceComparator implements Comparator<BillDto> {
    @Override
    public int compare(BillDto o1, BillDto o2) {
        return (int)(o1.getAmount() - o2.getAmount());
    }
}
