package com.xworkz.jdbc.dto;

public class Moviedto  {
    int id;
    String name;
    String director;
    String language;

    public Moviedto()
    {

    }

public Moviedto(int id,String name,String director,String language){
    this.id = id;
    this.name=name;
    this.director=name;
    this.language=language;

}

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
}
