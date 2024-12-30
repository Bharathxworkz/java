package com.xworkz.app.dao;


import com.xworkz.app.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

@Component
public class ProductDaoImpl implements ProductDao{

    @Autowired
    private EntityManagerFactory factory;

    @Override
    public boolean save(ProductDto productDto) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(productDto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public void UpdateProductId(int id,ProductDto productDto) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        ProductDto dto = entityManager.find(ProductDto.class,id);
        if(dto != null){
            dto.setProductName(dto.getProductName());
            dto.setId(dto.getId());
            dto.setCategory(dto.getCategory());
            dto.setProductNo(dto.getProductNo());
        }
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    @Override
    public boolean deleteProductId(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete from ProductDto dto where id = :id");
        query.setParameter("id",id);
        int noOfRowsDeleted = query.executeUpdate();
        entityManager.getTransaction().commit();
        if (noOfRowsDeleted > 0)

            return true;
        entityManager.close();
        return false;
   }

    @Override
    public ProductDto getUserById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        ProductDto Dto = entityManager.find(ProductDto.class,id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return Dto;
    }

    @Override
    public List<ProductDto> getAllDetails(ProductDto productDto) {
        EntityManager entityManager = factory.createEntityManager();
        Query query = entityManager.createQuery("select user from ProductDto user");
        List<ProductDto> Dtos = query.getResultList();
        return Dtos;
    }


}
