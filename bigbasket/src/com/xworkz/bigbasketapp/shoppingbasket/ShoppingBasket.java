package com.xworkz.bigbasketapp.shoppingbasket;

import com.xworkz.bigbasketapp.book.Book;

public class ShoppingBasket {

    public int shoppingBasketId;
    public String bookIsbn;
    public int count;
    public Book book;

    public ShoppingBasket(int shoppingBasketId, String bookIsbn, int count, Book book)
    {
        this.shoppingBasketId = shoppingBasketId;
        this.bookIsbn = bookIsbn;
        this.count = count;
        this.book = book;
    }
    public void getShopBasketDetails()
    {
        System.out.println("Shop basket details started");
        System.out.println("The shopping basket id is: "+this.shoppingBasketId);
        System.out.println("The book Isbn is: "+this.bookIsbn);
        System.out.println("The count is: "+this.count);
        System.out.println("Shop basket details ended");
        System.out.println("-----------------------------------------------------------");
        this.book.getBookDetails();
    }
}
