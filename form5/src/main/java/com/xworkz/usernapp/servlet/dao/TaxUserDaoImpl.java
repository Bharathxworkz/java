package com.xworkz.usernapp.servlet.dao;

import com.xworkz.usernapp.servlet.dto.TaxUserDto;
import com.xworkz.usernapp.util.EntityManagerFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

public class TaxUserDaoImpl implements TaxUserDao {
    @Override
    public boolean addTaxUser(TaxUserDto taxUserDto) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(TaxUserDto.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(taxUserDto);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        return true;
    }

    @Override
    public TaxUserDto getTaxUserById(int id) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(TaxUserDto.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        TaxUserDto dto = session.get(TaxUserDto.class, id);
        session.close();
        sessionFactory.close();
        return dto;
    }

    @Override
    public List<TaxUserDto> getAllUser() {

        EntityManager entityManager= EntityManagerFactoryUtil.getFactory().createEntityManager();
        Query query=entityManager.createQuery("select user from TaxUserDto user ");
        List<TaxUserDto>taxUserDtos=query.getResultList();
        return  taxUserDtos;
    }

   @Override
   public boolean deleteUserById(int id) {
       EntityManager entityManager= EntityManagerFactoryUtil.getFactory().createEntityManager();
       entityManager.getTransaction().begin();
       Query query=entityManager.createQuery("delete   from TaxUserDto user where user.id=:idd ");
       query.setParameter("idd",id);

       int noOfRows=query.executeUpdate();
       entityManager.getTransaction().commit();
       if(noOfRows>0)
           return  true;
       return  false;
   }
//
    @Override
   public void updateUser(TaxUserDto taxUserDto) {

        EntityManager entityManager= EntityManagerFactoryUtil.getFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(taxUserDto);
        entityManager.getTransaction().commit();
        entityManager.close();
   }
}


