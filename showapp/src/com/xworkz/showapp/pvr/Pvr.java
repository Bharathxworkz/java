package com.xworkz.showapp.pvr;

import com.xworkz.showapp.amazon.Amazon;
import com.xworkz.showapp.bookmyshow.BookMyShow;
import com.xworkz.showapp.paytm.Paytm;
public class Pvr implements BookMyShow, Amazon, Paytm {
    @Override
    public int miniBooking() {
        System.out.println("Book My Show ownerName:"+ ownerName);
        return 36;
    }
}
