package com.xworkz.hibernate.dao;

import com.xworkz.hibernate.dto.ProductDto;
import com.xworkz.hibernate.util.SessionFactoryUtil;
import org.hibernate.Session;

import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;

public class ECommerceDaoImpl implements ECommerceDao{
    @Override
    public boolean addProduct(ProductDto productDto) {

//        Configuration configuration = new Configuration();
//        configuration.configure("ch03rom.xml");
//        configuration.addAnnotatedClass(ProductDto.class);
//        SessionFactory sessionFactory = configuration.buildSessionFactory();








        EntityManager manager  =  SessionFactoryUtil.getEntityManagerFactory().createEntityManager();

               manager.getTransaction();
               manager.persist(productDto);
               manager.getTransaction().commit();



























/*
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(productDto);
        session.getTransaction().commit();
        session.close();
        SessionFactoryUtil.getSessionFactory().close();*/
//        sessionFactory.close();
        return true;
    }

  /*  @Override
    public ProductDto getProductById(int productId) {



     Session session =  SessionFactoryUtil.getSessionFactory().openSession() ;
    ProductDto dto =  session.get(ProductDto.class, productId);
        session.close();
        SessionFactoryUtil.getSessionFactory().close();
        return dto;
    }

    @Override
    public boolean updateProductNameById(String updateProductName, int id) {
//        Configuration configuration = new Configuration();
//        configuration.configure("ch03rom.xml");
//        configuration.addAnnotatedClass(ProductDto.class);
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = null;

        try{
            session = SessionFactoryUtil.getSessionFactory().openSession();
            session.beginTransaction();

            ProductDto productDto = session.get(ProductDto.class,id);
            if(productDto !=null){
                productDto.setProductName(updateProductName);
                session.update(productDto);
                session.getTransaction().commit();
                return  true;
            } else {
                System.out.println("Product Name with id " + id + " not found");
                return  false;
            }

        }  catch (Exception e){
            e.printStackTrace();
            if (session!=null && session.getTransaction() !=null){
                session.getTransaction().rollback();
            }
            return  false;
        } finally {
            if (session!=null){
                session.close();
            }
//            sessionFactory.close();
        }
    }

    @Override
    public boolean removeEcommerce(int id) {
        Session session = null;

        try{
            session = SessionFactoryUtil.getSessionFactory().openSession();
            session.beginTransaction();

            ProductDto productDto = session.get(ProductDto.class,id);
            if (productDto !=null){
                session.delete(productDto);
                session.getTransaction().commit();
                return  true;
            } else {
                System.out.println("App with id " + id + " not found");
                return false;
            }
        } catch (Exception e){
            e.printStackTrace();
            if (session !=null && session.getTransaction() != null){
                session.getTransaction().rollback();
            }
            return false;
        }
        finally {
            if (session != null) {
                session.close();
            }
        }
    }*/
}