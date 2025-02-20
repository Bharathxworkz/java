package com.xworkz.app.repository;

import com.xworkz.app.dto.UserDto;
import com.xworkz.app.dto.VendorDto;
import com.xworkz.app.entity.VendorEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import java.util.List;
@Slf4j
@Repository
public class VendorRepositoryImpl implements VendorRepository {
    @Autowired
    EntityManagerFactory entityManagerFactory;
//    @Override
//    public boolean vendorSave(VendorEntity vendorEntity) {
//        EntityManager entityManager= entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//        entityManager.persist(vendorEntity);
//        entityManager.getTransaction().commit();
//        entityManager.close();
//        return true;
//    }

    @Override
    public List<UserDto> getDistributorCp() {
        return entityManagerFactory.createEntityManager().createNamedQuery("getAllDistributor").setParameter("businessType", "wholesale").getResultList();

    }

    @Override
    public List<VendorDto> getVendor() {
        return entityManagerFactory.createEntityManager().createNamedQuery("getAllvendor").getResultList();

    }

    @Override
    public void updatevendor(VendorEntity vendorEntity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        VendorEntity existingVendor = entityManager.find(VendorEntity.class, vendorEntity.getId());

        if (existingVendor != null) {
            existingVendor.setCustomerName(vendorEntity.getCustomerName());
            existingVendor.setProductName(vendorEntity.getProductName());
            existingVendor.setRate(vendorEntity.getRate());
            existingVendor.setQty(vendorEntity.getQty());
            existingVendor.setDiscount(vendorEntity.getDiscount());
            existingVendor.setGst(vendorEntity.getGst());
            existingVendor.setAmount(vendorEntity.getAmount());
        } else {
            System.err.println("Vendor ID not found in DB: " + vendorEntity.getId());
        }

        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println("Update operation completed.");
    }


    @Override
    public boolean deleteStockById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("deleteeStockById");
        query.setParameter("idd",id);
        int noOfRows = query.executeUpdate();
        entityManager.getTransaction().commit();
        if (noOfRows>0)
            return true;
        return false;
    }
    @Override
    public VendorEntity findOneByCustomerAndProduct(String customerName, String productName) {
        
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        VendorEntity vendorEntity = null;
        try {
            Query query = entityManager.createNamedQuery("findByCustomerAndProduct");
            query.setParameter("customerName", customerName);
            query.setParameter("productName", productName);
            vendorEntity = (VendorEntity) query.getSingleResult();
        } catch (NoResultException e) {
            vendorEntity = null;
        }

        entityManager.getTransaction().commit();
        entityManager.close();
        return vendorEntity;
    }


}
