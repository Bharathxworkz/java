package com.xworkz.productapp.dao;

import com.xworkz.productapp.dto.ProductDto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EcomerceDaoImpl implements EcommerceDao {


    @Override
    public boolean addProduct(ProductDto productDto) {

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(ProductDto.class);
        configuration.configure();
         SessionFactory sessionFactory= configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(productDto);
        session.getTransaction().commit();
        session.close();
       sessionFactory.close();
        return true;
    }

}
