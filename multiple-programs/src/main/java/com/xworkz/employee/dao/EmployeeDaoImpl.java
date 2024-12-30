package com.xworkz.employee.dao;

import com.xworkz.employee.dto.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@Component
public class EmployeeDaoImpl implements EmployeeDao{

    @Autowired
    private EntityManagerFactory factory;

    @Override
    public boolean save(EmployeeDto employeeDto) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(employeeDto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public EmployeeDto getUserById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        EmployeeDto employeeDto = entityManager.find(EmployeeDto.class,id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return employeeDto;
    }

    @Override
    public List<EmployeeDto> getAllDetails(EmployeeDto employeeDto) {
        EntityManager entityManager = factory.createEntityManager();
        Query query = entityManager.createNamedQuery("getAllDetails");
        List<EmployeeDto> employeeDtos = query.getResultList();
        return employeeDtos;
    }

    @Override
    public void updateUserById(int id, EmployeeDto newUserData) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        EmployeeDto existing = entityManager.find(EmployeeDto.class,id);
        if(existing != null){
            existing.setName(newUserData.getName());
            existing.setEducation(newUserData.getEducation());
            existing.setSalary(newUserData.getSalary());
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public boolean DeleteUserById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("DeleteUserById");
        query.setParameter("id",id);
        int rowEffected = query.executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();
        return rowEffected > 0;
    }

    @Override
    public String getNameByEducation(String education) {
        return (String) factory.createEntityManager().createNamedQuery("getNameByEducation").
                setParameter("education",education).getSingleResult();
    }

    @Override
    public double getSalaryByName(String name) {
        return (double) factory.createEntityManager().createNamedQuery("getSalaryByName").
                setParameter("name",name).getSingleResult();
    }

    @Override
    public Object[] getSalaryEducationByName(String name) {
        return (Object[]) factory.createEntityManager().createNamedQuery("getSalaryEducationByName").
                setParameter("name",name).getSingleResult();
    }

    @Override
    public boolean updateSalaryByEducation(String education, double salary) {
        boolean isUpdated = false;
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("updateSalaryByEducation");
        query.setParameter("education",education);
        query.setParameter("salary",salary);
        int rowEffected = query.executeUpdate();
        entityManager.getTransaction().commit();
        if(rowEffected > 0)
            isUpdated = true;
        return  isUpdated;
    }

    @Override
    public boolean deleteEmployeeBySalary(double salary) {
        boolean isDeleted = false;
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("deleteEmployeeBySalary");
        query.setParameter("salary",salary);
        int rowEffected = query.executeUpdate();
        entityManager.getTransaction().commit();
        if(rowEffected > 0)
            isDeleted = true;
        return  isDeleted;
    }
}
