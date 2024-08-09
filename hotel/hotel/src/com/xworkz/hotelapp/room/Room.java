package com.xworkz.hotelapp.room;

import com.xworkz.hotelapp.hotel.Hotel;

public class Room extends Hotel {
    public String roomNumber;
    public String roomType;
    public Float pricePerNight;
    public String hotelName;

    public void details() {
        System.out.println("Room Details...");
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + roomType);
        System.out.println("Price Per Night: " + pricePerNight);
        System.out.println("Hotel Name: " + hotelName);
    }
}
