package com.xworkz.bigbasketapp;

import com.xworkz.bigbasketapp.author.Author;
import com.xworkz.bigbasketapp.book.Book;
import com.xworkz.bigbasketapp.customer.Customer;
import com.xworkz.bigbasketapp.shoppingbasket.ShoppingBasket;

public class bigBasketRunner {

    public static void main(String[] args) {
        Author author = new Author("Deepak guptha", "Banglore", "https://books.google.com");
        Book book = new Book("ISBN-13:978-1647831189","Inapirational publishing","Deepak gupta","Banglore",2019,"The girl with no dream",149.0,author);
        ShoppingBasket shopping = new ShoppingBasket(12,"ISBN-13:978-1647831189",1,book);
        Customer customer = new Customer("meghajaanu75@gmail.com","Bharath L",9019633098L,"Kolar",shopping);
        customer.getCustomerDetails();
    }
}
