package com.xworkz.roommatesapp.roomimpl;

import com.xworkz.roommatesapp.room.room;
import com.xworkz.roommatesapp.roommates.Roomates;

public class Rooms implements room {
    Roomates roomates[]= new Roomates[1];
    int index;

    @Override
    public boolean addRoomates(Roomates roomates) {
        boolean addRoomatesdetail=false;
        if (roomates != null && roomates.getName() != null && this.roomates.length > 0)
        {
            this.roomates[index]=roomates;
            addRoomatesdetail=true;
        }
        return addRoomatesdetail;
    }

    @Override
    public void getRoomatesdetails() {
        for (Roomates roomates : this.roomates)
        {
            System.out.println( "The details of roommates :" +roomates);
        }

    }

    @Override
    public int upadateroomatesbyid(int id, String newName) {
        for (int i = 0; i < roomates.length; i++) {
            if (roomates[i] != null && roomates[i].getId()== id)
            {
                roomates[i].setName( newName);
            }

        }
        return 0;
    }

    @Override
    public boolean deleteRoomatws(int id) {
        return false;
    }
}
