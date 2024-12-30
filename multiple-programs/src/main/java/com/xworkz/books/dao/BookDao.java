package com.xworkz.books.dao;

import com.xworkz.books.dto.Bookdto;

import java.util.List;

public interface BookDao {

    boolean save(Bookdto bookdto);

    Bookdto getUserById(int id);

    List<Bookdto> getAllDetails(Bookdto bookdto);

    void updateUserById(int id, Bookdto newUserData);

    boolean DeleteUserById(int id);

    String getNameByAuthor(String author);

    String getNameByYear(int year);

    Object [] getNameAuthorByYear(int year);

    boolean updateNameByYear(String name, int year);

    boolean deleteBookByName(String name);

}
