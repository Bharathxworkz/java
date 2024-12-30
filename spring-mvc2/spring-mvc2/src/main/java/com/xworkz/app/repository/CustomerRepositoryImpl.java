package com.xworkz.app.repository;

import com.xworkz.app.dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository{

    public CustomerRepositoryImpl(){
        System.out.println("CustomerRepositoryImpl started");
    }

    @Autowired
    private EntityManagerFactory factory;

    @Override
    public boolean save(CustomerDto dto) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(dto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public List<CustomerDto> getAllUsers() {

        return factory.createEntityManager().createNamedQuery("getAllUsers").getResultList();
    }

    @Override
    public boolean deleteCustomer(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("deleteCustomer");
        query.setParameter("idd", id);
        int noOfRows = query.executeUpdate();
        entityManager.getTransaction().commit();
        if (noOfRows > 0)
            return true;
        return false;
    }

    @Override
    public CustomerDto getUserById(int id) {
        return (CustomerDto) factory.createEntityManager().createNamedQuery("getUserById").setParameter("idd", id).getSingleResult();
    }

    @Override
    public void updateUser(CustomerDto dto) {
        EntityManager entityManager= factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(dto);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
