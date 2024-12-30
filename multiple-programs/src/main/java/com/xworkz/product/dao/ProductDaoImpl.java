package com.xworkz.product.dao;

import com.xworkz.product.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@Component
public class ProductDaoImpl implements ProductDao{

    @Autowired
    private EntityManagerFactory factory;

    @Override
    public boolean save(ProductDto productDto) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(productDto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public void UpdateProductId(int id,ProductDto productDto) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        ProductDto dto = entityManager.find(ProductDto.class,id);
        if(dto != null){
            dto.setProductName(dto.getProductName());
            dto.setId(dto.getId());
            dto.setCategory(dto.getCategory());
            dto.setProductPrice(dto.getProductPrice());
            dto.setRatings(dto.getRatings());
        }
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    @Override
    public boolean deleteProductId(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("deleteProductId");
        query.setParameter("id",id);
        int noOfRowsDeleted = query.executeUpdate();
        entityManager.getTransaction().commit();
        if (noOfRowsDeleted > 0)

        entityManager.close();
        return true;
    }

    @Override
    public boolean updatePriceByName(double price, String name) {

        boolean isUpdated = false;
        EntityManager entityManager = factory.createEntityManager();;
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("updatePriceByName");
        query.setParameter("price",price);
        query.setParameter("name",name);
        int isRowEffected = query.executeUpdate();
        entityManager.getTransaction().commit();
        if(isRowEffected > 0)
            isUpdated = true;

        return isUpdated;
    }

    @Override
    public double getPriceByName(String name) {
        return (double) factory.createEntityManager().createNamedQuery("getPriceByName").
                setParameter("name",name).getSingleResult();
    }

    @Override
    public Object[] getCategoryRatingsByName(String name) {
        return (Object []) factory.createEntityManager().createNamedQuery("getCategoryRatingsByName").
                setParameter("name",name).getSingleResult();
    }

    @Override
    public boolean updateCategoryByPrice(String category, double price) {
        boolean iscategoryUpdated = false;
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("updateCategoryByPrice");
        query.setParameter("category",category);
        query.setParameter("price",price);
        int rowEffected = query.executeUpdate();
        entityManager.getTransaction().commit();
        if(rowEffected > 0)
            iscategoryUpdated = true;

        return iscategoryUpdated;
    }

    @Override
    public boolean deleteProductByPrice(double price) {
        boolean isDeleted = false;
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("deleteProductByPrice");
        query.setParameter("price",price);
        int rowEffected = query.executeUpdate();
        entityManager.getTransaction().commit();
        if(rowEffected >0)
            isDeleted = true;

        return isDeleted;
    }

    @Override
    public ProductDto getUserById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        ProductDto Dto = entityManager.find(ProductDto.class,id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return Dto;
    }

    @Override
    public List<ProductDto> getAllDetails(ProductDto productDto) {
        EntityManager entityManager = factory.createEntityManager();
        Query query = entityManager.createQuery("getAllDetails");
        List<ProductDto> Dtos = query.getResultList();
        return Dtos;
    }
}
