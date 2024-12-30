package com.xworkz.books.service;

import com.xworkz.books.dao.BookDao;
import com.xworkz.books.dto.Bookdto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDao bookDao;

    boolean isvalidated = false;

    @Override
    public boolean validAndSave(Bookdto bookdto) {
        if(bookdto !=null){
            if(bookdto.getBookName() != null && !bookdto.getBookName().isEmpty()){
                System.out.println("Name validated");
                bookDao.save(bookdto);
                isvalidated = true;
            }
        }
        return isvalidated;
    }

    @Override
    public Bookdto getUserById(int id) {
        return bookDao.getUserById(id);
    }

    @Override
    public List<Bookdto> getAllDetails(Bookdto bookdto) {
        return bookDao.getAllDetails(bookdto);
    }

    @Override
    public void updateUserById(int id, Bookdto newUserData) {
        bookDao.updateUserById(id,newUserData);
    }

    @Override
    public boolean DeleteUserById(int id) {
        return bookDao.DeleteUserById(id);
    }

    @Override
    public String getNameByAuthor(String author) {
        return bookDao.getNameByAuthor(author);
    }

    @Override
    public String getNameByYear(int year) {
        return bookDao.getNameByYear(year);
    }

    @Override
    public Object[] getNameAuthorByYear(int year) {
        Object [] obj = bookDao.getNameAuthorByYear(year);
        return obj;
    }

    @Override
    public boolean updateNameByYear(String name, int year) {
        return bookDao.updateNameByYear(name,year);
    }

    @Override
    public boolean deleteBookByName(String name) {
        return bookDao.deleteBookByName(name);
    }
}
