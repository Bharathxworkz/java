package com.xworkz.roommatesapp;

import com.xworkz.roommatesapp.roomimpl.Rooms;
import com.xworkz.roommatesapp.roommates.Roomates;

public class RoomatesRunner {
    public static void main(String[] args) {
        Rooms rooms= new Rooms();
        Roomates roomates= new Roomates();
        roomates.setName("Bhartah L");
        roomates.setId(1);
        roomates.setAge(21);
        roomates.setProfesional("IT");
        roomates.setSalary(50000.00);

        System.out.println();
        rooms.addRoomates(roomates);
        rooms.upadateroomatesbyid(1,"DreamGirl");
        rooms.getRoomatesdetails();
    }
}
