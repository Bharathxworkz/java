package com.xworkz.productapp.dao;

import com.xworkz.productapp.dto.ProductDto;
import com.xworkz.productapp.util.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EcomerceDaoImpl implements EcommerceDao {
    @Override
    public boolean addProduct(ProductDto productDto) {

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(ProductDto.class);
        configuration.configure();
         SessionFactory sessionFactory= configuration.buildSessionFactory();
        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(productDto);
        session.getTransaction().commit();
        session.close();
        SessionFactoryUtil.closeSessionFactory();
        return true;
    }

    @Override
    public ProductDto getProductById(int product_id) {
     //ProductDto productDto =  new Configuration().configure().addAnnotatedClass(ProductDto.class).buildSessionFactory().openSession().get(ProductDto.class,product_id);
     /*   Configuration configuration = new Configuration();
       configuration.addAnnotatedClass(ProductDto.class);
        configuration.configure();
        SessionFactory sessionFactory= configuration.buildSessionFactory();*/

        Session session = SessionFactoryUtil.getSessionFactory().openSession();
        ProductDto dto =session.get(ProductDto.class,product_id);
        session.close();
        SessionFactoryUtil.closeSessionFactory();

        return dto;
    }public ProductDto updateProductDetails(int product_id, int price) {
       /* Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(ProductDto.class);
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();*/


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
    }

}


