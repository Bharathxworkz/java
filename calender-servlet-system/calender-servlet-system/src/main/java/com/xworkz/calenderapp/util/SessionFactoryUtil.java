package com.xworkz.calenderapp.util;

import com.xworkz.calenderapp.dto.EventDto;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {
    private static SessionFactory sessionFactory = null;

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    static {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(EventDto.class);
        sessionFactory = configuration.buildSessionFactory();

    }
}
