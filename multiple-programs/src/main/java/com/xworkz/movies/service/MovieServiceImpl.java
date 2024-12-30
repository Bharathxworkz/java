package com.xworkz.movies.service;

import com.xworkz.movies.dao.MovieDao;
import com.xworkz.movies.dto.MovieDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MovieServiceImpl implements MovieService{
    @Autowired
    private MovieDao movieDao;
    boolean isvalidated = false;

    @Override
    public boolean save(MovieDto movieDto) {
        if(movieDto !=null){
            if(movieDto.getMovieName() != null && !movieDto.getMovieName().isEmpty()){
                System.out.println("Movie Name validated");
                movieDao.save(movieDto);
                isvalidated = true;
            }
        }
        return isvalidated;
    }

    @Override
    public MovieDto getUserById(int id) {
        return movieDao.getUserById(id);
    }

    @Override
    public List<MovieDto> getAllDetails(MovieDto movieDto) {
        return movieDao.getAllDetails(movieDto);
    }

    @Override
    public void updateUserById(int id, MovieDto newUserData) {
        movieDao.updateUserById(id,newUserData);
    }

    @Override
    public boolean DeleteUserById(int id) {
        return movieDao.DeleteUserById(id);
    }

    @Override
    public String getHeroByName(String name) {
        return movieDao.getHeroByName(name);
    }

    @Override
    public String getHerionByName(String name) {
        return movieDao.getHerionByName(name);
    }

    @Override
    public Object[] getNameYearByHero(String hero) {
        Object [] obj = movieDao.getNameYearByHero(hero);
        return obj;
    }

    @Override
    public boolean updateYearByName(int year, String name) {
        return movieDao.updateYearByName(year,name);
    }

    @Override
    public boolean deleteMovieByYear(int year) {
        return movieDao.deleteMovieByYear(year);
    }
}
