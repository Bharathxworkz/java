package com.xworkz.movies.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "movie_details")
@NamedQueries({
@NamedQuery(name = "getAllDetails",query = "select user from MovieDto user"),
@NamedQuery(name = "DeleteUserById",query = "delete from MovieDto dto where dto.id =: id"),
@NamedQuery(name = "getHeroByName",query = "select user.hero from MovieDto user where user.movieName =: name"),
@NamedQuery(name = "getHerionByName",query = "select user.heroin from MovieDto user where user.movieName =: name"),
@NamedQuery(name = "getNameYearByHero",query = "select user.movieName, user.releaseYear from MovieDto user where user.hero =: hero"),
@NamedQuery(name = "updateYearByName",query = "update MovieDto dto set dto.releaseYear =: year where dto.movieName =: name"),
@NamedQuery(name = "deleteMovieByYear",query = "delete from MovieDto dto where dto.releaseYear =: year"),
})
public class MovieDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private int id;
    @Column(name = "movie_name")
    private String movieName;
    @Column(name = "movie_hero")
    private String hero;
    @Column(name = "movie_heroin")
    private String heroin;
    @Column(name = "movie_releasing_year")
    private int releaseYear;
}
