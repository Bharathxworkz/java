package com.xworkz.bigbasketapp.author;

public class Author {

    public String name;
    public String address;
    public String url;

    public Author(String name, String address, String url)
    {
        if(name != null && address != null && url != null)
        {
            this.name = name;
            this.address = address;
            this.url = url;
        }
        else System.out.println("Provide valid information.....!!");
    }
    public void getAuthorDetails()
    {
        System.out.println("Author details started");
        System.out.println("Name of the Author is: "+this.name);
        System.out.println("Address of the author is: "+this.address);
        System.out.println("Url is: "+this.url);
        System.out.println("Author details ended");
        System.out.println("-------------------------------------------------------");
    }
}
