package com.xworkz.userapp.dao;


import com.xworkz.userapp.dto.SuperMarketDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@Component
public class SuperMarketDaoImpl implements SuperMarketDao {

    @Autowired
    EntityManagerFactory entityManagerFactory;
    @Override
    public boolean save(SuperMarketDto superMarketDto) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(superMarketDto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public SuperMarketDto getSuperMarketDetailsById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createNamedQuery("getSuperMarketDetailsById");
        query.setParameter("idd",id);
        SuperMarketDto userDto = (SuperMarketDto) query.getSingleResult();
        entityManager.close();
        return userDto;
    }

    @Override
    public SuperMarketDto getSuperMarketDetailsByName(String name) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createNamedQuery("getSuperMarketDetailsByName");
        query.setParameter("namee",name);
        SuperMarketDto userDto = (SuperMarketDto) query.getSingleResult();
        entityManager.close();
        return userDto;
    }

    @Override
    public List<SuperMarketDto> getAllUsers() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createNamedQuery("getAllUsers");
        List<SuperMarketDto> userDtos = query.getResultList();
        return userDtos;
    }

    @Override
    public boolean deleteSuperMarketById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("deleteSuperMarketById");
        query.setParameter("idd",id);
        int noOfRows = query.executeUpdate();
        entityManager.getTransaction().commit();
        if (noOfRows>0)
            return true;
        return false;
    }



    @Override
    public int getPriceById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createNamedQuery("getPriceById");
        query.setParameter("i",id);
        int price = (int) query.getSingleResult();
        return price;
    }

    @Override
    public Object[] getProductNameAndProductCategoryById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Query query = entityManager.createNamedQuery("getProductNameAndProductCategoryById");
        query.setParameter("i",id);
        Object[] obj  = (Object[]) query.getSingleResult();
        return obj;
    }

    @Override
    public Object[] getProductNameAndProductCategoryByManufactureDate(String manufactureDate) {
        return (Object[]) entityManagerFactory.createEntityManager().createNamedQuery("getProductNameAndProductCategoryByManufactureDate").setParameter("mn",manufactureDate).getSingleResult();
    }


    @Override
    public boolean updatePriceByProductName(int price,String productName) {
        boolean isUpdated =  false;
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("updatePriceByProductName");
        query.setParameter("pr", price);
        query.setParameter("pn" , productName);
        int noOfRowsUpdated = query.executeUpdate();
        entityManager.getTransaction().commit();
        if (noOfRowsUpdated>0)
            isUpdated = true;
         return isUpdated;
    }

}

