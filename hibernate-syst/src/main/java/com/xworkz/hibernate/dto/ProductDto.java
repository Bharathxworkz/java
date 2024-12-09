package com.xworkz.hibernate.dto;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity  //to map Object with db table  --it will tell hibernate this is the class you have to map
@Table(name = "product_details") // table name
public class ProductDto {
    @Column(name = "product_id")  // column name
    @Id // to tell it is a primary key
    @GenericGenerator(name="dev" , strategy = "increment")
    @GeneratedValue(generator = "dev")
    private int productId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_category")
    private String productCategory;
    @Column(name = "product_price")
    private double price;
    @Column(name = "product_ratings")
    private double ratings;

}
