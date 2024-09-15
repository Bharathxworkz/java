package com.xworkz.travelapp.srs;

import com.xworkz.travelapp.contract.RedbusContract;

public class SrsImpl implements RedbusContract {
    @Override
    public int miniBooking() {
        return 24;
    }

    @Override
    public boolean busCondition() {
        return true;
    }
}
