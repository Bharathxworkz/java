package com.xworkz.app.repository;


import com.xworkz.app.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;


@Repository
public class  ProductRepositoryImpl implements  ProductRepository{

    @Autowired
    EntityManagerFactory entityManagerFactory;
    @Override
    public boolean save(ProductDto productDto) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(productDto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public List<ProductDto> getAllProducts() {
        return   entityManagerFactory.createEntityManager().createNamedQuery("getAllProducts").getResultList();

    }

    @Override
    public boolean deleteProductById(int id) {
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query=entityManager.createNamedQuery("deleteProductById");
        query.setParameter("idd",id);
        int noOfRows= query.executeUpdate();
        entityManager.getTransaction().commit();
        if(noOfRows>0)
            return true;
        return false;
    }

    @Override
    public ProductDto getProductById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createNamedQuery("getUserById");
        query.setParameter("idd",id);
        ProductDto productDto = (ProductDto) query.getSingleResult();
        entityManager.close();
        return productDto;
    }

    @Override
    public void updateProduct(ProductDto productDto) {
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(productDto);
        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
