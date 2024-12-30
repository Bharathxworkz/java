package com.xworkz.productapp.dao;

import com.xworkz.productapp.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
@Component
public class EcomerceDaoImpl implements EcommerceDao {
    @Autowired
    private EntityManagerFactory factory;
    @Override
    public boolean addProduct(ProductDto productDto) {



            EntityManager entityManager = factory.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(productDto);
            entityManager.getTransaction().commit();
            entityManager.close();
            return true;

        /*Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(ProductDto.class);
        configuration.configure();
         SessionFactory sessionFactory= configuration.buildSessionFactory();
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(productDto);
        session.getTransaction().commit();
        session.close();
        SessionFactoryUtil.closeSessionFactory();
        return true;*/
    }

   /* @Override
    public ProductDto getProductById(int product_id) {
     //ProductDto productDto =  new Configuration().configure().addAnnotatedClass(ProductDto.class).buildSessionFactory().openSession().get(ProductDto.class,product_id);
     *//*   Configuration configuration = new Configuration();
       configuration.addAnnotatedClass(ProductDto.class);
        configuration.configure();
        SessionFactory sessionFactory= configuration.buildSessionFactory();*//*

        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        ProductDto dto =session.get(ProductDto.class,product_id);
        session.close();
        SessionFactoryUtil.closeSessionFactory();

        return dto;
    }public ProductDto updateProductDetails(int product_id, int price) {
       *//* Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(ProductDto.class);
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();*//*


        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        ProductDto dto = null;

        try {
            transaction = session.beginTransaction();

            dto = session.get(ProductDto.class, product_id);
            if (dto != null) {

                dto.setPrice(price);

                session.update(dto);
            }


            transaction.commit();
        } catch (Exception e) {

            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {

            session.close();
            SessionFactoryUtil.closeSessionFactory();

        }

        return dto;
    }*/

}


