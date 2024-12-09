package com.xworkz.userapp.dao;

import com.xworkz.userapp.dto.UserDto;
import com.xworkz.userapp.util.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class UserDaoImpl implements UserDao{
    @Override
    public boolean addUser(UserDto userDto) {
       Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(UserDto.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session =sessionFactory .openSession();
        session.beginTransaction();
        session.save(userDto);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        return true;
    }

    @Override
    public UserDto detailsByid(int id) {
        Session session = null;
        UserDto dto = null;
        try {
            session = SessionFactoryUtil.getSessionFactory().openSession();
            dto = session.get(UserDto.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) session.close();
        }
        return dto;
    }

    @Override
    public UserDto detailsBymail(String email) {
        Session  session =SessionFactoryUtil.getSessionFactory().openSession();
      Query query= session.createQuery("select userdto from UserDto userdto where UserDto.email=:mail");
      query.setParameter("mail",email);
      UserDto userDto=(UserDto) query.getSingleResult();

      return userDto;
    }
}
