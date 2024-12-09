package com.xworkz.calenderapp.dao;

import com.xworkz.calenderapp.dto.EventDto;
import com.xworkz.calenderapp.util.SessionFactoryUtil;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.List;

public class EventDaoImpl implements EventDao{
    @Override
    public boolean addEvent(EventDto eventDto) {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(eventDto);
        session.getTransaction().commit();
        session.close();

        return true;
    }

    @Override
    public EventDto getUserEventById(int id) {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        EventDto eventDto = session.get(EventDto.class , id);
        session.close();
        return eventDto;
    }

    @Override
    public List<EventDto> getAllUsers() {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        Query query = session.createQuery("select event from EventDto event");
        List<EventDto> eventDto =  query.getResultList();
        return eventDto;
    }

    @Override
    public EventDto getUserEventByName(String name) {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        Query query = session.createQuery("select event from EventDto event where event.name=:nm");
        query.setParameter("nm",name);
        EventDto eventDto = (EventDto) query.getSingleResult();
        return eventDto;
    }

    @Override
    public boolean deleteUserById(int id) {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("delete from EventDto event where event.id=:idd");
        query.setParameter("idd",id);
        int noOfRows = query.executeUpdate();
        session.getTransaction().commit();
        if (noOfRows>0)
            return true;
        return false;
    }

    @Override
    public void updateUser(EventDto eventDto) {
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.merge(eventDto);
        session.getTransaction().commit();
        session.close();
    }
}