package com.xworkz.app.dao;

import com.xworkz.app.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRegistrationRepositoryImpl implements UserRegistrationRepository {

   public UserRegistrationRepositoryImpl(){
       System.out.println("UserRegistrationRepositoryImpl started");
   }
    @Autowired
    EntityManagerFactory entityManagerFactory;
    @Override
    public boolean createUser(UserDto userDto) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(userDto);
        entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public List<UserDto> getAllUsers() {
        return entityManagerFactory.createEntityManager().createNamedQuery("getAllUsers").getResultList();

    }

    @Override
    public boolean deleteUserById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("deleteUserById");
        query.setParameter("idd",id);
        int noOfRows = query.executeUpdate();
        entityManager.getTransaction().commit();
        if (noOfRows>0)
            return true;
        return false;
    }

    @Override
    public UserDto getUserById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createNamedQuery("getUserById");
        query.setParameter("idd",id);
        UserDto userDto = (UserDto) query.getSingleResult();
        entityManager.close();
        return userDto;
    }

    @Override
    public void updateUser(UserDto userDto) {
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(userDto);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
