package org.xworkz.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.xworkz.spring.dto.ProductDto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Component
public class ProductDaoImpl implements ProductDao {

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
    public void UpdateUser(ProductDto productDto) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(productDto);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public boolean deleteUserById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        ProductDto product = entityManager.find(ProductDto.class, id);
        if (product != null) {
            entityManager.remove(product);
            entityManager.getTransaction().commit();
            entityManager.close();
            return true;
        }
        entityManager.getTransaction().rollback();
        entityManager.close();
        return false;
    }

    @Override
    public ProductDto getUserbyId(int id) {
        EntityManager entityManager = factory.createEntityManager();
        ProductDto product = entityManager.find(ProductDto.class, id);
        entityManager.close();
        return product;
    }

    @Override
    public String getPrpductNameById(int id) {
        return(String) factory.createEntityManager().createQuery("select product.productName from ProductDto product where product.id = : id").setParameter("id",id).getSingleResult();
    }

    @Override
    public Object[] getProductNameAndPriceBYId(int id) {
        return (Object[]) factory.createEntityManager().createQuery("select product.productName ,product.price from ProductDto product where product.id = : id").setParameter("id",id).getSingleResult();
    }

    @Override
    public boolean updateProductNameById(String productName, int id) {
        boolean nameIsUpdated=false;
       EntityManager entityManager= factory.createEntityManager();
       entityManager.getTransaction().begin();
      int rowsaffected = entityManager.createQuery("update ProductDto product set product.productName=:name where product.id=:id").setParameter("name",productName).setParameter("id",id).executeUpdate();
      if (rowsaffected>0){
          nameIsUpdated=true;
      }
       entityManager.getTransaction().commit();
      entityManager.close();
        return nameIsUpdated;
    }
}
