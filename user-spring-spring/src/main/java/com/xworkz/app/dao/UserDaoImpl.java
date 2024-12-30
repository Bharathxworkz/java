package com.xworkz.app.dao;

import com.xworkz.app.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@Component
public class UserDaoImpl implements UserDao {

    @Autowired
    EntityManagerFactory entityManagerFactory;
    @Override
    public boolean save(UserDto userDto) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(userDto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public UserDto getUserById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select user from UserDto user where user.id=:idd");
        query.setParameter("idd",id);
        UserDto userDto = (UserDto) query.getSingleResult();
        entityManager.close();
        return userDto;
    }

    @Override
    public UserDto getUserByName(String name) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select user from UserDto user where user.name=:namee");
        query.setParameter("namee",name);
        UserDto userDto = (UserDto) query.getSingleResult();
        entityManager.close();
        return userDto;
    }

    @Override
    public List<UserDto> getAllUsers() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select user from UserDto user");
        List<UserDto> userDtos = query.getResultList();
        return userDtos;
    }

    @Override
    public boolean deleteUserById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete from UserDto user where user.id=:idd");
        query.setParameter("idd",id);
        int noOfRows = query.executeUpdate();
        entityManager.getTransaction().commit();
        if (noOfRows>0)
            return true;
        return false;
    }

    @Override
    public void updateUser(String name, int id) {

            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            UserDto user = entityManager.find(UserDto.class, id);
            user.setName(name);
            entityManager.merge(user);
            entityManager.getTransaction().commit();
        }

}

