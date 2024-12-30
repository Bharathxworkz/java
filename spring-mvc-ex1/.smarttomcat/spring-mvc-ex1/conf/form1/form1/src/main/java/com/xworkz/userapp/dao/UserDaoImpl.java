package com.xworkz.userapp.dao;

import com.xworkz.userapp.dto.UserDto;
import com.xworkz.userapp.util.EntityManagerFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean addUser(UserDto userDto) {

        Configuration configuration=new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(UserDto.class);
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(userDto);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        return  true;
    }

    @Override
    public UserDto getUserById(int id) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(UserDto.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        UserDto dto = session.get(UserDto.class, id);
        session.close();
        sessionFactory.close();
        return dto;
    }

    @Override
    public UserDto getUserByName(String firstName) {
        EntityManager entityManager= EntityManagerFactoryUtil.getFactory().createEntityManager();

        Query query=entityManager.createQuery("select contactuser from UserDto contactuser where contactuser.firstName=:fn");
        query.setParameter("fn",firstName);
        UserDto userDto=(UserDto) query.getSingleResult();
        entityManager.close();;
        return  userDto;



    }

    @Override
    public List<UserDto> getAllUsers() {

        EntityManager entityManager= EntityManagerFactoryUtil.getFactory().createEntityManager();
        Query query=entityManager.createQuery("select user from UserDto user ");
        List<UserDto>userDtos=query.getResultList();
        return  userDtos;
    }

    @Override
    public boolean deleteUserById(int id) {
        EntityManager entityManager= EntityManagerFactoryUtil.getFactory().createEntityManager();
        entityManager.getTransaction().begin();
        Query query=entityManager.createQuery("delete   from UserDto user where user.id=:idd ");
        query.setParameter("idd",id);

        int noOfRows=query.executeUpdate();
        entityManager.getTransaction().commit();
        if(noOfRows>0)
            return  true;
        return  false;

    }

    @Override
    public void updateUser(UserDto userDto) {

        EntityManager entityManager= EntityManagerFactoryUtil.getFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(userDto);
        entityManager.getTransaction().commit();
        entityManager.close();





    }


}
