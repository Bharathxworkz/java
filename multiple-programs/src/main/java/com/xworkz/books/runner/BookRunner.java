package com.xworkz.books.runner;

import com.xworkz.books.config.SpringConfiguration;
import com.xworkz.books.dto.Bookdto;
import com.xworkz.books.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class BookRunner {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Bookdto bookdto = new Bookdto();
        BookService bookService = applicationContext.getBean(BookService.class);

        //valid and save
        bookdto.setBookName("The Alchemist");
        bookdto.setAuthorname("Fyodor Dostoevsky");
        bookdto.setPublishingYear(1866);
        bookService.validAndSave(bookdto);
        System.out.println("Added successfully");

        //get by id
        Bookdto getbyId = bookService.getUserById(1);
        System.out.println(getbyId);

        //get all the details;
        List<Bookdto> bookdtoList = bookService.getAllDetails(bookdto);
        System.out.println(bookdtoList);

        //update the details by id;
        Bookdto updateValue = new Bookdto();
        updateValue.setBookName("The Great Gatsby");
        updateValue.setAuthorname("The Great Gatsby");
        updateValue.setPublishingYear(1851);
        bookService.updateUserById(7,updateValue);
        System.out.println("Updated successfully...!!");

        //delete operation;
        bookService.DeleteUserById(5);
        System.out.println("Row deleted");

        String author = "Harper lee";
        String name = bookService.getNameByAuthor(author);
        System.out.println("The book written by the author "+author+" is: "+name);

        int year = 1925;
        name = bookService.getNameByYear(year);
        System.out.println("The book written in the year of "+year+ "is: "+name);

        System.out.println("get Name and Author By Year");
        Object [] obj = bookService.getNameAuthorByYear(1949);
        Arrays.stream(obj).forEach(System.out::println);

        boolean updated = bookService.updateNameByYear("Panchatantra",1847);
        System.out.println("Name changed: "+updated);

        boolean isDeleted = bookService.deleteBookByName("Moby-Dick");
        System.out.println("Is row deleted: "+isDeleted);
    }
}
