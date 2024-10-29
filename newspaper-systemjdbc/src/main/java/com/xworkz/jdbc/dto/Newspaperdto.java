package com.xworkz.jdbc.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Newspaperdto {
    int id;
    String paperName;
    int noOfpages;
    String language;
    int price;
    String editorName;
    String date;
    int noOfArticle;

    public Newspaperdto(int id,String paperName, int noOfpages, String language, int price, String editorName, String date,int noOfArticle)
    {
       this.id=id;
       this.paperName=paperName;
       this.noOfpages=noOfpages;
       this.language=language;
       this.price=price;
       this.editorName=editorName;
       this.date=date;
       this.noOfArticle=noOfArticle;
    }
    public Newspaperdto(){

    }
}
