package com.xworks.formsystem.servlets.util;

import com.xworks.formsystem.servlets.dto.FormDto;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {
    private static SessionFactory sessionFactory=null;


    public static SessionFactory getFactory(){

        return  sessionFactory;
    }

    static {
        org.hibernate.cfg.Configuration configuration=new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(FormDto.class);
        sessionFactory =configuration.buildSessionFactory();

    }
}
