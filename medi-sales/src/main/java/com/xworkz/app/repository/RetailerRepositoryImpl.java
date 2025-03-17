package com.xworkz.app.repository;

import com.xworkz.app.dto.AddRetailerDto;
import com.xworkz.app.entity.AddRetailerEntity;
import com.xworkz.app.entity.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.Collections;
import java.util.List;

@Repository
@Slf4j
public class RetailerRepositoryImpl implements RetailerRepository{
    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean save(AddRetailerEntity addRetailerEntity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        UserEntity mediSaleEntity= entityManager.find(UserEntity.class, addRetailerEntity.getMedisalesId());
        addRetailerEntity.setUserEntity1(mediSaleEntity);
        entityManager.persist(addRetailerEntity);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;

    }

    @Override
    public List<AddRetailerDto> getAllRetailers(int id) {
        return entityManagerFactory.createEntityManager().createQuery("from AddRetailerEntity entity where entity.userEntity1.id=:id")
                .setParameter("id", id)
                .getResultList();


    }
}
