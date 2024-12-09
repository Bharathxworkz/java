package com.xworkz.jopapplication.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryUtil {

    public static EntityManagerFactory entityManagerFactory = null;

    public static EntityManagerFactory getEntityManagerFactory(){
        return entityManagerFactory;
    }

    static {
        entityManagerFactory = Persistence.createEntityManagerFactory("test");
    }
}
