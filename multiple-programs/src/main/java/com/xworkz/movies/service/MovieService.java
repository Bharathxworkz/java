package com.xworkz.movies.service;

import com.xworkz.movies.dto.MovieDto;

import java.util.List;

public interface MovieService {

    boolean save(MovieDto movieDto);

    MovieDto getUserById(int id);

    List<MovieDto> getAllDetails(MovieDto movieDto);

    void updateUserById(int id, MovieDto newUserData);

    boolean DeleteUserById(int id);

    String getHeroByName(String name);

    String getHerionByName(String name);

    Object [] getNameYearByHero(String hero);

    boolean updateYearByName(int year,String name);

    boolean deleteMovieByYear(int year);
}
