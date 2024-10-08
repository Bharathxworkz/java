package com.xworkz.roommatesapp.room;


import com.xworkz.roommatesapp.roommates.Roomates;

public interface room  {
    boolean addRoomates(Roomates roomates);
    void getRoomatesdetails();
    int upadateroomatesbyid(int id, String  newName);
    boolean deleteRoomatws(int id);


}
