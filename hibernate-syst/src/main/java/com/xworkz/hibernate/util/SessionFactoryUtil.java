package com.xworkz.hibernate.util;

import com.xworkz.hibernate.dto.ProductDto;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SessionFactoryUtil {
    private  static EntityManagerFactory entityManagerFactory = null;

    public static EntityManagerFactory getEntityManagerFactory(){
        return entityManagerFactory;
    }

    static {
        entityManagerFactory = Persistence.createEntityManagerFactory("test");
    }


}
