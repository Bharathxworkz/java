package com.xworkz.calenderapp.service;

import com.xworkz.calenderapp.dao.EventDao;
import com.xworkz.calenderapp.dao.EventDaoImpl;
import com.xworkz.calenderapp.dto.EventDto;

import java.util.Collections;
import java.util.List;

public class Eventserviceimpl implements EventService{

    EventDao eventDao = new EventDaoImpl();
    @Override
    public boolean validateAndSaveEvent(EventDto eventdto) {
        boolean eventTypeValid = false;
        boolean nameValid = false;
        boolean eventStored = false;
        if ((eventdto!=null)){
            if(eventdto.getEventType() != null && !eventdto.getEventType().isEmpty()){
                System.out.println("Event Type validated");
                eventTypeValid = true;
            }
            if(eventdto.getName() != null && !eventdto.getName().isEmpty()){
                System.out.println("Name validated");
                nameValid = true;
            }
        }
        if(eventTypeValid == true && nameValid == true)
            eventStored =  eventDao.addEvent(eventdto);
        return eventStored;
    }

    @Override
    public EventDto getUserEventById(int id) {
        return eventDao.getUserEventById(id);
    }

    @Override
    public List<EventDto> getAllUsers() {
        return eventDao.getAllUsers();
    }

    @Override
    public EventDto getUserEventByName(String name) {
        return eventDao.getUserEventByName(name);
    }

    @Override
    public boolean deleteUserById(int id) {
        return eventDao.deleteUserById(id);
    }

    @Override
    public void updateUser(EventDto eventDto) {
        eventDao.updateUser(eventDto);
    }
}
