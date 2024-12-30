package com.xworkz.movies.dao;

import com.xworkz.movies.dto.MovieDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@Component
public class MoviedaoImpl implements MovieDao{

    @Autowired
    private EntityManagerFactory factory;

    @Override
    public boolean save(MovieDto movieDto) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(movieDto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public MovieDto getUserById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        MovieDto movieDto = entityManager.find(MovieDto.class,id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return movieDto;
    }

    @Override
    public List<MovieDto> getAllDetails(MovieDto movieDto) {
        EntityManager entityManager = factory.createEntityManager();
        Query query = entityManager.createNamedQuery("getAllDetails");
        List<MovieDto> movieDtos = query.getResultList();
        return movieDtos;
    }

    @Override
    public void updateUserById(int id, MovieDto newUserData) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        MovieDto existing = entityManager.find(MovieDto.class,id);
        if(existing != null){
            existing.setMovieName(newUserData.getMovieName());
            existing.setHero(newUserData.getHero());
            existing.setHeroin(newUserData.getHeroin());
            existing.setReleaseYear(newUserData.getReleaseYear());
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
    public String getHeroByName(String name) {
        return (String) factory.createEntityManager().createNamedQuery("getHeroByName").
                setParameter("name",name).getSingleResult();
    }

    @Override
    public String getHerionByName(String name) {
        return (String) factory.createEntityManager().createNamedQuery("getHerionByName").
                setParameter("name",name).getSingleResult();
    }

    @Override
    public Object[] getNameYearByHero(String hero) {
        return (Object[]) factory.createEntityManager().createNamedQuery("getNameYearByHero").
                setParameter("hero",hero).getSingleResult();
    }

    @Override
    public boolean updateYearByName(int year, String name) {
        boolean isUpdated = false;
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("updateYearByName");
        query.setParameter("year",year);
        query.setParameter("name",name);
        int rowEffected = query.executeUpdate();
        entityManager.getTransaction().commit();
        if(rowEffected > 0)
            isUpdated = true;
        return  isUpdated;
    }

    @Override
    public boolean deleteMovieByYear(int year) {
        boolean isDeleted = false;
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("deleteMovieByYear");
        query.setParameter("year",year);
        int rowEffected = query.executeUpdate();
        entityManager.getTransaction().commit();
        if(rowEffected > 0)
            isDeleted = true;
        return  isDeleted;
    }
}
