package com.xworkz.usernapp.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryUtil {

    public  static EntityManagerFactory factory=null;

    public  static EntityManagerFactory getFactory(){
        return  factory;
    }
    static {
        factory= Persistence.createEntityManagerFactory("test");
    }
}
