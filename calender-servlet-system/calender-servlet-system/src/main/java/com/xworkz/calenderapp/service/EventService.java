package com.xworkz.calenderapp.service;

import com.xworkz.calenderapp.dto.EventDto;

import java.util.List;

public interface EventService {
    boolean validateAndSaveEvent(EventDto eventdto);
    EventDto getUserEventById(int id);
    List<EventDto> getAllUsers();
    EventDto getUserEventByName(String name);

    boolean deleteUserById(int id);
    void updateUser(EventDto eventDto);
}
