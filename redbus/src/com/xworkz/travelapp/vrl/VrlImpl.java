package com.xworkz.travelapp.vrl;

import com.xworkz.travelapp.agency.TravelAgency;
import com.xworkz.travelapp.contract.RedbusContract;

public class VrlImpl implements RedbusContract {


    @Override
    public int miniBooking() {
        return 22;
    }

    @Override
    public boolean busCondition() {
        return false;
    }
}
