package com.xworkz.repository;

import com.xworkz.dto.NyearDto;
import com.xworkz.entity.NyearEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

@Slf4j
@Repository
public class NyearRepositoryImpl implements NyearRepository {
    @Autowired
    EntityManagerFactory factory;

    @Override
    public boolean save(NyearEntity entity) {
            EntityManager entityManager = factory.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(entity);
            entityManager.getTransaction().commit();
            return true;
    }

    @Override
    public boolean checkEmail(String email) {
        try {
            EntityManager entityManager = factory.createEntityManager();
         Query query =   entityManager.createQuery("Select count(user) from NyearEntity user where user.email = :emai");
            query.setParameter("emai",email);
            Long count = (Long) query.getSingleResult();
            return count>0;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
       return false;
    }

    @Override
    public boolean checkPhNo(Long contact) {
        try {
            EntityManager entityManager = factory.createEntityManager();
            Query query =   entityManager.createQuery("Select count(user) from NyearEntity user where user.contact = :contact");
            query.setParameter("contact",contact);
            Long count = (Long) query.getSingleResult();
            return count>0;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public NyearEntity getDtoByEmail(String email) {


        try {


            return (NyearEntity) factory.createEntityManager()
                    .createQuery("Select user from NyearEntity user where user.email = :email")
                    .setParameter("email", email)
                    .getSingleResult();
        }catch (Exception e){
            e.printStackTrace();
        }
       return new NyearEntity();
    }

    @Override
    public NyearEntity getEmail(String email) {

        try {


            return (NyearEntity) factory.createEntityManager()
                    .createQuery("Select user from NyearEntity user where user.email = :email")
                    .setParameter("email", email)
                    .getSingleResult();
        }catch (Exception e){
            e.printStackTrace();
        }
        return new NyearEntity();

    }

    @Override
    public void updatePasswordByEmail(String email, String newPassword, String confirmPassword) {
        try {
            EntityManager entityManager = factory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        int updated = entityManager.createQuery(
                        "UPDATE NyearEntity user SET user.password = :newPassword, user.confirmPassword = :confirm WHERE user.email = :email")
                .setParameter("newPassword", newPassword)
                .setParameter("confirm", confirmPassword)
                .setParameter("email", email)
                .executeUpdate();

        transaction.commit();
        entityManager.close();

        if (updated == 0) {
            throw new RuntimeException("No user found with the given email.");
        }

    }catch (Exception e){
            log.info("{}",e.getMessage());
        }
    }

    @Override
    public NyearEntity getById(int id) {
        return factory.createEntityManager().find(NyearEntity.class,id);
    }

    @Override
    public NyearEntity updatedatata(NyearEntity nyearEntity) {
        try {
            EntityManager entityManager = factory.createEntityManager();
            entityManager.getTransaction().begin();
            NyearEntity nyear = entityManager.merge(nyearEntity);
            entityManager.getTransaction().commit();
            entityManager.close();
            return nyear;
        }catch (Exception e) {
            e.printStackTrace();
        }

        return new NyearEntity();
    }



}