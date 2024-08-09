package com.xworkz.hotelapp.hotel;

import com.xworkz.hotelapp.room.Room;

public class Hotel {
    public boolean isAvailable;
    public Room room;

    public boolean book(Room room) {
        boolean isBooked = false;
        if (isAvailable) {
            if (room != null) {
                this.room = room;
                this.room.details();
                isBooked = true;
            } else {
                System.out.println("Please provide valid room details.");
            }
        } else {
            System.out.println("Hotel is not available.");
        }
        return isBooked;
    }
}
