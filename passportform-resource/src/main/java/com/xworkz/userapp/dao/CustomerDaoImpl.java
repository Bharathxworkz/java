package com.xworkz.userapp.dao;

import com.xworkz.userapp.dto.CustomerDto;
import com.xworkz.userapp.util.SessionFactoryUtil;
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

    @Override
    public CustomerDto getdetailsbyid(int id) {
        Session session = null;
        CustomerDto dto = null;
        try {
            session = SessionFactoryUtil.getSessionFactory().openSession();
            dto = session.get(CustomerDto.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) session.close();
        }
        return dto;
    }
}
