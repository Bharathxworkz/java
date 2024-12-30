package com.xworkz.app.dao;

import com.xworkz.app.dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@Component
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    EntityManagerFactory entityManagerFactory;
    @Override
    public boolean save(CustomerDto userDto) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(userDto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public CustomerDto getUserById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("getUserById");
        query.setParameter("idd",id);
        CustomerDto userDto = (CustomerDto) query.getSingleResult();
        entityManager.close();
        return userDto;
    }

    @Override
    public CustomerDto getUserByName(String name) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("getUserByName");
        query.setParameter("namee",name);
        CustomerDto userDto = (CustomerDto) query.getSingleResult();
        entityManager.close();
        return userDto;
    }

    @Override
    public List<CustomerDto> getAllUsers() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("getAllUsers");
        List<CustomerDto> userDtos = query.getResultList();
        return userDtos;
    }

    @Override
    public boolean deleteUserById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("deleteUserById");
        query.setParameter("idd",id);
        int noOfRows = query.executeUpdate();
        entityManager.getTransaction().commit();
        if (noOfRows>0)
            return true;
        return false;
    }

    @Override
    public void updateUser(String name, int id) {

            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            CustomerDto user = entityManager.find(CustomerDto.class, id);
            user.setCustomerName(name);
            entityManager.merge(user);
            entityManager.getTransaction().commit();
        }

}

