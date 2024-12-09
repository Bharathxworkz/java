package com.xworkz.userapp.dao;

import com.xworkz.userapp.dto.CustomerDto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CustomerDaoImpl implements CustomerDao{
    @Override
    public boolean addCustomer(CustomerDto customerDto) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(CustomerDto.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(customerDto);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        return true;
    }
}
