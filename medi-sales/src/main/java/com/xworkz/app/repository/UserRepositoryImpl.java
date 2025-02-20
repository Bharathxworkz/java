package com.xworkz.app.repository;

import com.xworkz.app.entity.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

@Repository
@Slf4j
public class UserRepositoryImpl implements UserRepository {
    @Autowired
    EntityManagerFactory factory;
    @Override
    public boolean save(UserEntity userEntity) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(userEntity);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public boolean checkEmail(String email) {
        try {
            EntityManager entityManager = factory.createEntityManager();
            Query query = entityManager.createNamedQuery("checkEmail");
            query.setParameter("email", email);
            Long count = (Long) query.getSingleResult();
            return count>0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public UserEntity getUserByEmailAndPassword(String email) {
        try {
            EntityManager entityManager = factory.createEntityManager();
            Query query = entityManager.createNamedQuery("checkEmailPassword");
            query.setParameter("email", email);
            // query.setParameter("password", password);
            UserEntity userEntity = (UserEntity) query.getSingleResult();
            log.info("User Entity is {} ", userEntity);
            return userEntity;
        } catch (Exception e) {
            log.info("{}",e.getMessage());
        }

        return new UserEntity();
    }

    @Override
    public boolean checkPhoneNumber(long mobile) {
        try {
            EntityManager entityManager = factory.createEntityManager();
            Query query =   entityManager.createQuery("Select count(user) from UserEntity user where user.mobile = :contact");
            query.setParameter("contact", mobile);
            Long count = (Long) query.getSingleResult();
            return count>0;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }
    @Override
    public UserEntity getUserByEmail(String email) {
        try {
            EntityManager entityManager = factory.createEntityManager();
            Query query = entityManager.createNamedQuery("checkEmailPassword");
            query.setParameter("email", email);
            // query.setParameter("password", password);
            UserEntity userEntity = (UserEntity) query.getSingleResult();
            log.info("User Entity is {} ", userEntity);
            return userEntity;
        } catch (Exception e) {
            log.info("{}",e.getMessage());
        }
        return new UserEntity();
    }

    @Override
    public UserEntity updateProfile(UserEntity userEntity) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        UserEntity entity =  entityManager.merge(userEntity);
        entityManager.getTransaction().commit();
        entityManager.close();
        return entity;
    }

    @Override
    public UserEntity getDtoByEmail(String email) {
        EntityManager entityManager = factory.createEntityManager();
        try {
            Query query = entityManager.createNamedQuery("getDtoByEmail");
            query.setParameter("email", email);
            UserEntity mediSaleEntity = (UserEntity) query.getSingleResult();
            log.info("User Entity is {} ", mediSaleEntity);
            return mediSaleEntity;
        } catch (Exception e) {
            log.info("{}",e.getMessage());
        }
        return new UserEntity();
    }

    @Override
    public UserEntity getUserById(Integer id) {
        return factory.createEntityManager().find(UserEntity.class,id);
    }
}
