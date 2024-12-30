package com.xworkz.movies.runner;

import com.xworkz.movies.config.SpringConfiguration;
import com.xworkz.movies.dto.MovieDto;
import com.xworkz.movies.service.MovieService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class MovieRunner {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        MovieDto movieDto = new MovieDto();
        MovieService movieService = applicationContext.getBean(MovieService.class);

        //validate and save
        movieDto.setMovieName("Charlie 777");
        movieDto.setHero("Rakshith shetty");
        movieDto.setHeroin("Sangeetha sringeri");
        movieDto.setReleaseYear(2022);
        movieService.save(movieDto);
        System.out.println("Added successfully");

        //get by id;
        MovieDto getById = movieService.getUserById(1);
        System.out.println(getById);

        //get all details;
        List<MovieDto> movieDtos = movieService.getAllDetails(movieDto);
        System.out.println(movieDtos);

        //update all fields by id;
        MovieDto updateMovie = new MovieDto();
        updateMovie.setMovieName("Arasu");
        updateMovie.setHero("Punith Rajkumar");
        updateMovie.setHeroin("Ramya");
        updateMovie.setReleaseYear(2006);
        movieService.updateUserById(8,updateMovie);
        System.out.println("Update successfully...!!");

        //delete by id;
        movieService.DeleteUserById(9);
        System.out.println("Row deleted");

        //getHeroByName
        String name = "Titanic";
        String hero = movieService.getHeroByName(name);
        System.out.println("The movies "+name+" is acted by "+hero);

        //getHeroinByName
        String name1 = "Titanic";
        String heroin = movieService.getHerionByName(name1);
        System.out.println("The movies "+name1+" is acted by "+heroin);

        //get Name and Year By Hero
        System.out.println("get and Name Year By Hero");
        Object [] obj = movieService.getNameYearByHero("Keanu Reeves");
        Arrays.stream(obj).forEach(System.out::println);

        //updateYearByName
        boolean updated = movieService.updateYearByName(2005,"The Matrix");
        System.out.println("Year updated: "+updated);

        boolean deleted = movieService.deleteMovieByYear(2019);
        System.out.println("Is deleted: "+deleted);
    }
}
