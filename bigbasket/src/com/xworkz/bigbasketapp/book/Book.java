package com.xworkz.bigbasketapp.book;

import com.xworkz.bigbasketapp.author.Author;

public class Book {

    public String isbn;
    public String publisherName;
    public String authorName;
    public String authorAddress;
    public int year;
    public String title;
    public double price;
    public Author author;

    public Book(String isbn, String publisherName, String authorName, String authorAddress,
                int year, String title, double price, Author author)
    {
        this.isbn = isbn;
        this.publisherName = publisherName;
        this.authorName = authorName;
        this.authorAddress = authorAddress;
        this.year = year;
        this.title = title;
        this.price = price;
        this.author = author;
    }
    public void getBookDetails()
    {
        System.out.println("Book details started");
        System.out.println("The isbn is: "+this.isbn);
        System.out.println("The publisher name is: "+this.publisherName);
        System.out.println("The author name is: "+this.authorName);
        System.out.println("The author address is: "+this.authorAddress);
        System.out.println("The publishing year is: "+this.year);
        System.out.println("The title of the book is: "+this.title);
        System.out.println("The price of the book is: "+this.price);
        System.out.println("Book details ended");
        System.out.println("------------------------------------------------------");
        this.author.getAuthorDetails();
    }
}
