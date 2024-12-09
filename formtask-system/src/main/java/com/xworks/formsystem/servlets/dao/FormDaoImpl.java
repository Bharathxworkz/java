package com.xworks.formsystem.servlets.dao;

import com.xworks.formsystem.servlets.dto.FormDto;
import com.xworks.formsystem.servlets.util.SessionFactoryUtil;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FormDaoImpl implements FormDao{
    @Override
    public boolean addForm(FormDto dto) {
        Session session= SessionFactoryUtil.getFactory().openSession();
        session.beginTransaction();
        session.save(dto);
        session.getTransaction().commit();
        session.close();
       // SessionFactoryUtil.getFactory().close();
        return true;
    }

    @Override
    public FormDto getUserById(int id) {
        Session session=   SessionFactoryUtil.getFactory().openSession();
        FormDto dto=session.get(FormDto.class,id);
        session.close();

        return dto;
    }

 @Override
  public List<FormDto> getAllUsers() {
     Session session=SessionFactoryUtil.getFactory().openSession();
     Query query= session.createQuery("select form from FormDto form ");
   List< FormDto> formDto= query.getResultList();


     return formDto;
 }

    @Override
    public FormDto getUserFormbyFirstname(String firstName) {
        Session session=SessionFactoryUtil.getFactory().openSession();
       Query query= session.createQuery("select form from FormDto form where form.firstName=:fn");
      query.setParameter("fn",firstName);
       FormDto formDto=(FormDto) query.getSingleResult();


        return formDto;
    }

    @Override
    public boolean deleteUserById(int id) {
        Session session=SessionFactoryUtil.getFactory().openSession();
        session.beginTransaction();
        Query query=session.createQuery("delete from FormDto dto where dto.id=:idd");
        query.setParameter("idd",id);
        int noOfRowsDeleted=query.executeUpdate();
        session.getTransaction().commit();
        if(noOfRowsDeleted>0)
            return  true;
        return  false;
    }

    @Override
    public void updateUser(FormDto dto) {
        Session session=SessionFactoryUtil.getFactory().openSession();
        session.beginTransaction();
        session.merge(dto);
        session.getTransaction().commit();;
        session.close();

    }
}
