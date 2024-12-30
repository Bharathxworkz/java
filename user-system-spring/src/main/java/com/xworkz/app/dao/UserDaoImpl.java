package com.xworkz.app.dao;

import com.xworkz.app.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

@Component
public class UserDaoImpl implements UserDao{

    @Autowired
    private EntityManagerFactory factory;

    @Override
    public boolean save(UserDto userDto) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(userDto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public String getEmailById(int id) {
        return (String) factory.createEntityManager().createNamedQuery("getEmailById").setParameter("id",id).getSingleResult();
    }

    @Override
    public Object[] getNameAndEmailById(int id) {
        return(Object[]) factory.createEntityManager().createNamedQuery("getNameAndEmailById").setParameter("id",id).getSingleResult();
    }

    @Override
    public Object[] getNameandAgeBYAdhar(long AdharNo) {
        return(Object[]) factory.createEntityManager().createNamedQuery("getNameandAgeBYAdhar").setParameter("i",AdharNo).getSingleResult();
    }

    @Override
    public boolean updateNameByAdharNo(String userName, long AdharNo) {
        boolean NameisUpdated = false;
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("update");
        query.setParameter("name", userName);
        query.setParameter("adha", AdharNo);
        int rowsAffected = query.executeUpdate();
        if (rowsAffected > 0) {
            NameisUpdated = true;
        }
        entityManager.getTransaction().commit();
        entityManager.close();
        return NameisUpdated;
    }

    @Override
    public boolean deleteById(int id) {
        boolean rowdelted = false;
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("delete");
        query.setParameter("id",id);
        int rowsAffected = query.executeUpdate();
        if (rowsAffected > 0) {
            rowdelted = true;
        }
        entityManager.getTransaction().commit();
        entityManager.close();
        return rowdelted;
    }

    @Override
    public boolean updareNmaeByid(String userName,int id) {
        boolean nameIsUpdated=false;
       EntityManager entityManager = factory.createEntityManager();
       entityManager.getTransaction().begin();
      Query query = entityManager.createNamedQuery("updareNmaeByid");
      query.setParameter("name",userName);
      query.setParameter("id",id);
     int  rowsaffected = query.executeUpdate();
     if (rowsaffected>0){
         nameIsUpdated=true;
     }
      entityManager.getTransaction().commit();
      entityManager.close();
      return nameIsUpdated;

    }

    @Override
    public String getNameBYId(int id) {
        return (String) factory.createEntityManager().createNamedQuery("getNameBYId").setParameter("id",id).getSingleResult();
    }

    @Override
    public String getAddressById(int id) {
        return (String) factory.createEntityManager().createNamedQuery("getAddressById").setParameter("id",id).getSingleResult();
    }

    @Override
    public Object[] getAdharNoandNameById(int id) {
        return (Object[]) factory.createEntityManager().createNamedQuery("getAdharNoandNameById").setParameter("id",id).getSingleResult();
    }


}




