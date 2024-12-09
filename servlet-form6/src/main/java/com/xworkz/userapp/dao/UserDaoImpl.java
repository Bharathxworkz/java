package com.xworkz.userapp.dao;

import com.xworkz.userapp.dto.UserDto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserDaoImpl implements UserDao{
    @Override
    public boolean addUser(UserDto userDto) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(UserDto.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(userDto);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        return true;
    }
}
