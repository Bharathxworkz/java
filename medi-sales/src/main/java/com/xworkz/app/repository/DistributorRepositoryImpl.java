package com.xworkz.app.repository;

import com.xworkz.app.dto.DistributorDto;
import com.xworkz.app.dto.UserDto;
import com.xworkz.app.dto.VendorDto;
import com.xworkz.app.entity.DistributorEntity;
import com.xworkz.app.entity.VendorEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

@Repository
@Slf4j
public class DistributorRepositoryImpl implements DistributorRepository {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public boolean save(DistributorEntity distributorEntity) {
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(distributorEntity);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public List<DistributorDto> getAllstock() {
        return entityManagerFactory.createEntityManager().createNamedQuery("getAllUsers").getResultList();

    }
    @Override
    public boolean deleteStockById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("deleteStockById");
        query.setParameter("idd",id);
        int noOfRows = query.executeUpdate();
        entityManager.getTransaction().commit();
        if (noOfRows>0)
            return true;
        return false;
    }

    @Override
    public DistributorEntity getStockById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createNamedQuery("getStockById");
        query.setParameter("idd",id);
        DistributorEntity distributorEntity= (DistributorEntity) query.getSingleResult();
        entityManager.close();
        return distributorEntity;
    }

    @Override
    public void updateStock(DistributorEntity distributorEntity) {
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(distributorEntity);
        entityManager.getTransaction().commit();
        entityManager.close();
    }




}