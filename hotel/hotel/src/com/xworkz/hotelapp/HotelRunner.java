package com.xworkz.hotelapp;

import com.xworkz.hotelapp.hotel.Hotel;
import com.xworkz.hotelapp.room.Room;

public class HotelRunner {
    public static void main(String[] args) {

        Hotel hotel = new Hotel();
        hotel.isAvailable = true;

        Room room = new Room();
        room.roomNumber = "22";
        room.roomType = "Deluxe";
        room.pricePerNight = 5000.0f;
        room.hotelName = "oyo";

        hotel.book(room);
    }
}
