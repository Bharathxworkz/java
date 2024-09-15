package com.xworkz.showapp;

import com.xworkz.showapp.bookmyshow.BookMyShow;
import com.xworkz.showapp.pvr.Pvr;

public class BookMyShowRunner {

    public static void main(String[] args) {


        BookMyShow bookMyShow = new Pvr();
        bookMyShow.miniBooking();
    }
}
