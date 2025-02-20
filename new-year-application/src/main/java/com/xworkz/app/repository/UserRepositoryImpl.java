package com.xworkz.app.repository;

import com.xworkz.app.dto.UserDto;
import com.xworkz.app.entity.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Slf4j
@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private EntityManagerFactory factory;

    @Override
    public boolean save(UserEntity entity) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
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

//    @Override
//    public void updatePasswordByEmail(String email, String newPassword,String confirmPassword) {
//        EntityManager entityManager = factory.createEntityManager();
//        EntityTransaction transaction = entityManager.getTransaction();
//
//        try {
//            transaction.begin();
//
//            int updated = entityManager.createQuery(
//                            "UPDATE UserEntity user SET user.password = :newPassword ,user.confirmPassword=:confirm WHERE user.email = :email")
//                    .setParameter("newPassword", newPassword)
//                    .setParameter("confirm", confirmPassword)
//                    .setParameter("email", email)
//                    .executeUpdate();
//
//            transaction.commit();
//            if (updated == 0) {
//                throw new RuntimeException("No user found with the given email.");
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }

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
    public UserEntity getDtoByEmail(String email) {
        EntityManager entityManager = factory.createEntityManager();
        try {
            Query query = entityManager.createNamedQuery("getDtoByEmail");
            query.setParameter("email", email);
            UserEntity userEntity = (UserEntity) query.getSingleResult();
            log.info("User Entity is {} ", userEntity);
            return userEntity;
        } catch (Exception e) {
            log.info("{}",e.getMessage());
        }
        return new UserEntity();
    }

    @Override
    public UserEntity getUserById(Integer id) {
        return factory.createEntityManager().find(UserEntity.class,id);
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
    public List<UserDto> findAll() {
        EntityManager entityManager = factory.createEntityManager();

        List<UserDto> userDtos = new ArrayList<>();
            log.info("Fetched users: {}", userDtos.size());
            try {
                Query query = entityManager.createQuery("SELECT u FROM UserEntity u", UserEntity.class);
                List<UserEntity> userEntities = (List<UserEntity>) query.getResultList();
                for (UserEntity userEntity : userEntities) {
                    UserDto userDto = new UserDto();
                    BeanUtils.copyProperties(userEntity, userDto);
                    userDtos.add(userDto);
                }
                return userDtos;

            } catch (Exception e) {
                log.info("Error retrieving all users: {}", e.getMessage());
            }finally {
                entityManager.close();

            }
            return null;
        }

    @Override
    public boolean checkPhoneNumber(Long contactNumber) {
        try {
            EntityManager entityManager = factory.createEntityManager();
            Query query = entityManager.createNamedQuery("checkPhoneNumber");
            query.setParameter("contactNumber", contactNumber);
            Long count = (Long) query.getSingleResult();
            return count>0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
