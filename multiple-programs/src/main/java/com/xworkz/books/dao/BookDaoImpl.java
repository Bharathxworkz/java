package com.xworkz.books.dao;

import com.xworkz.books.dto.Bookdto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@Component
public class BookDaoImpl implements BookDao{

    @Autowired
    private EntityManagerFactory factory;

    @Override
    public boolean save(Bookdto bookdto) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(bookdto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public Bookdto getUserById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Bookdto bookdto = entityManager.find(Bookdto.class,id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return bookdto;
    }

    @Override
    public List<Bookdto> getAllDetails(Bookdto bookdto) {
        EntityManager entityManager = factory.createEntityManager();
        Query query = entityManager.createNamedQuery("getAllDetails");
        List<Bookdto> bookdtos = query.getResultList();
        return bookdtos;
    }

    @Override
    public void updateUserById(int id, Bookdto newUserData) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Bookdto existing = entityManager.find(Bookdto.class,id);
        if(existing != null){
            existing.setBookName(newUserData.getBookName());
            existing.setAuthorname(newUserData.getAuthorname());
            existing.setPublishingYear(newUserData.getPublishingYear());
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
    public String getNameByAuthor(String author) {
        return (String) factory.createEntityManager().createNamedQuery("getNameByAuthor").
          setParameter("author",author).getSingleResult();
    }

    @Override
    public String getNameByYear(int year) {
        return (String) factory.createEntityManager().createNamedQuery("getNameByYear").
                setParameter("year",year).getSingleResult();
    }

    @Override
    public Object[] getNameAuthorByYear(int year) {
        return (Object[]) factory.createEntityManager().createNamedQuery("getNameAuthorByYear").
                setParameter("year",year).getSingleResult();
    }

    @Override
    public boolean updateNameByYear(String name, int year) {
        boolean isNameUpdated = false;
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("updateNameByYear");
        query.setParameter("name",name);
        query.setParameter("year",year);
        int rowEffected = query.executeUpdate();
        entityManager.getTransaction().commit();
        if(rowEffected > 0)
            isNameUpdated = true;
        return isNameUpdated;
    }

    @Override
    public boolean deleteBookByName(String name) {
        boolean isBookDeleted = false;
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("deleteBookByName");
        query.setParameter("name",name);
        int rowEffected = query.executeUpdate();
        entityManager.getTransaction().commit();
        if(rowEffected > 0)
            isBookDeleted = true;
        return isBookDeleted;
    }
}
