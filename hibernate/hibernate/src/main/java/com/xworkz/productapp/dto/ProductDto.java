package com.xworkz.productapp.dto;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_details")
public class ProductDto {

    @Column(name = "product_id")
    @Id
    public int ProductId;
    @Column(name = "product_name")
    private String ProductName;
    @Column(name = "Category")
    private String ProductCategory;
    @Column(name = "price")
    private double price;
    @Column(name = "Ratings")
    private String Ratings;
}
