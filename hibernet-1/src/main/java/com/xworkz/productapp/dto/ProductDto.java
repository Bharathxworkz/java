package com.xworkz.productapp.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "product_details")

public class ProductDto {

    @Column(name = "product_id")
    @Id
    private int productId;
    @Column(name = "name")
    private String Name;
    @Column(name = "category")
    private String productCategory;
    @Column(name = "price")
    private double price;
    @Column(name = "ratings")
    private double ratings;
}
