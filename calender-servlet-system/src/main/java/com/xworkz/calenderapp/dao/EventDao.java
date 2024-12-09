package com.xworkz.calenderapp.dao;

import com.xworkz.calenderapp.dto.EventDto;

import java.util.List;

public interface EventDao {
    public boolean addEvent(EventDto eventDto);
    EventDto getUserEventById(int id);
    List<EventDto> getAllUsers();
    EventDto getUserEventByName(String name);
    boolean deleteUserById(int id);
    void updateUser(EventDto eventDto);
}
