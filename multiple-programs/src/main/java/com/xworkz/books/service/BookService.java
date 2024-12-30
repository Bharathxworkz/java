package com.xworkz.books.service;

import com.xworkz.books.dto.Bookdto;

import java.util.List;

public interface BookService {

    boolean validAndSave(Bookdto bookdto);

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
