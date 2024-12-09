package com.xworkz.jopapplication.dao;

import com.xworkz.jopapplication.dto.JobDto;
import com.xworkz.jopapplication.util.EntityManagerFactoryUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class JobDaoImpl implements JobDao{
    @Override
    public boolean validAndSave(JobDto jobDto) {

        EntityManager entityManager = EntityManagerFactoryUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(jobDto);
        entityManager.getTransaction().commit();
        entityManager.close();

        return true;
    }

    @Override
    public JobDto getById(int id) {

        EntityManager entityManager = EntityManagerFactoryUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        JobDto jobDto = entityManager.find(JobDto.class,id);
        entityManager.getTransaction().commit();
        entityManager.close();

        return jobDto;
    }

   @Override
    public JobDto getUserByName(String name) {

        EntityManager entityManager = EntityManagerFactoryUtil.getEntityManagerFactory().createEntityManager();
        Query query = entityManager.createQuery("select user from JobDto user where user.name=:n");
        query.setParameter("n",name);
        JobDto jobDto = (JobDto) query.getSingleResult();
        entityManager.close();

        return jobDto;

    }

    @Override
    public JobDto getUserByPhoneNo(String phoneNo) {

        //database logic;
        //query is a interface - help us to perform RUD operation using custom inputs;

        EntityManager entityManager = EntityManagerFactoryUtil.getEntityManagerFactory().createEntityManager();
        Query query = entityManager.createQuery("select user from JobDto user where user.phoneNo=:pn");
        query.setParameter("pn",phoneNo);
        JobDto jobDto = (JobDto) query.getSingleResult();
        entityManager.close();

        return jobDto;
    }

    @Override
    public boolean deleteUserById(int userid) {

        EntityManager entityManager = EntityManagerFactoryUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete JobDto dto where dto.userid=:userid");
        query.setParameter("userid",userid);
        int rowsDeleted = query.executeUpdate();
        entityManager.getTransaction().commit();

        entityManager.close();

        if(rowsDeleted > 0 )
            return true;

        return false;
    }

    @Override
    public void updateUserById(JobDto jobDto) {

    EntityManager entityManager = EntityManagerFactoryUtil.entityManagerFactory.createEntityManager();
    entityManager.getTransaction().begin();
    entityManager.merge(jobDto);
    entityManager.getTransaction().commit();
    entityManager.close();
    }

    @Override
    public List<JobDto> getAllUsers() {

        //db logic;
        EntityManager entityManager = EntityManagerFactoryUtil.getEntityManagerFactory().createEntityManager();
        Query query = entityManager.createQuery("select user from JobDto user");
        List<JobDto> jobDtos = query.getResultList();

        return jobDtos;
    }

}

