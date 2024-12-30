package com.xworkz.car.dao;

import com.xworkz.car.dto.CarDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao{

    @Autowired
    private EntityManagerFactory factory;

    @Override
    public boolean save(CarDto carDto) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(carDto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public CarDto getUserById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        CarDto carDto = entityManager.find(CarDto.class,id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return carDto;
    }

    @Override
    public List<CarDto> getAllDetails(CarDto carDto) {
        EntityManager entityManager = factory.createEntityManager();
        Query query = entityManager.createNamedQuery("getAllDetails");
        List<CarDto> carDtos = query.getResultList();
        return carDtos;
    }

    @Override
    public void updateUserById(int id, CarDto newUserData) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        CarDto existing = entityManager.find(CarDto.class,id);
        if(existing != null){
            existing.setName(newUserData.getName());
            existing.setModel(newUserData.getModel());
            existing.setPrice(newUserData.getPrice());
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public boolean DeleteUserById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("DeleteUserById");
        query.setParameter("id",id);
        int rowEffected = query.executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();
        return rowEffected > 0;
    }

    @Override
    public String getNameByModel(String model) {
        return (String) factory.createEntityManager().createNamedQuery("getNameByModel").
                setParameter("model",model).getSingleResult();
    }

    @Override
    public String getNameByPrice(double price) {
        return (String) factory.createEntityManager().createNamedQuery("getNameByPrice").
                setParameter("price",price).getSingleResult();
    }

    @Override
    public Object[] getNameModelByPrice(double price) {
        return (Object[]) factory.createEntityManager().createNamedQuery("getNameModelByPrice").
                setParameter("price",price).getSingleResult();
    }

    @Override
    public boolean updateNameByModel(String name, String model) {
        boolean isNameUpdated = false;
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("updateNameByModel");
        query.setParameter("name",name);
        query.setParameter("model",model);
        int rowEffected = query.executeUpdate();
        entityManager.getTransaction().commit();
        if(rowEffected > 0)
            isNameUpdated = true;
        return isNameUpdated;
    }

    @Override
    public boolean deleteCarByName(String name) {
        boolean isDeleted = false;
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("deleteBookByName");
        query.setParameter("name",name);
        int rowEffected = query.executeUpdate();
        entityManager.getTransaction().commit();
        if(rowEffected > 0)
            isDeleted = true;
        return isDeleted;
    }
}
