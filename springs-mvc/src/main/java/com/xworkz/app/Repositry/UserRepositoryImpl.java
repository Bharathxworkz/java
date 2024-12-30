package com.xworkz.app.Repositry;

import com.xworkz.app.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private EntityManagerFactory factory;

    @Override
    public boolean validateAndSave(UserDto dto) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(dto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;

    }

    @Override
    public List<UserDto> getallUser() {
        return factory.createEntityManager().createNamedQuery("getAllData").getResultList();
    }

    @Override
    public void deleteUserById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.createQuery("delete from UserDto dto where dto.id = :id")
                .setParameter("id", id)
                .executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public UserDto getUserById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        Query query = entityManager.createNamedQuery("getUserById");
        query.setParameter("idd", id);
        UserDto userDto = (UserDto) query.getSingleResult();
        entityManager.close();
        return userDto;
    }

    @Override
    public void updateUser(UserDto userDto) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(userDto);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
