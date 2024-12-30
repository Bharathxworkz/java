package com.xworkz.userapp.repository;

import com.xworkz.userapp.dto.TaxUserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;
@Repository
public class TaxUserRegistrationRepositoryImpl implements TaxUserRegistrationRepository{

@Autowired
EntityManagerFactory entityManagerFactory;
    @Override
    public boolean save(TaxUserDto taxUserDto) {

            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(taxUserDto);
            entityManager.getTransaction().commit();
            entityManager.close();
            return true;
    }

    @Override
    public List<TaxUserDto> getAllTaxUsers() {
        return   entityManagerFactory.createEntityManager().createNamedQuery("getAllTaxUsers").getResultList();

    }

    @Override
    public boolean deleteTaxUserById(int id) {
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query=entityManager.createNamedQuery("deleteTaxUserById");
        query.setParameter("idd",id);
        int noOfRows= query.executeUpdate();
        entityManager.getTransaction().commit();
        if(noOfRows>0)
            return true;
        return false;
    }

    @Override
    public TaxUserDto getTaxUserById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createNamedQuery("getTaxUserById");
        query.setParameter("idd",id);
        TaxUserDto taxUserDto = (TaxUserDto) query.getSingleResult();
        entityManager.close();
        return taxUserDto;
    }

    @Override
    public void updateTaxUser(TaxUserDto taxUserDto) {
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(taxUserDto);
        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
