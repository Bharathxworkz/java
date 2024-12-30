package com.xworkz.app.dto;


import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "product_tab")
public class ProductDto {

    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "abhi",strategy = "increment")
    @GeneratedValue(generator = "abhi")
    @Column(name = "id")
    private  int id;
    @Column(name = "productName")
    private String productName;
    @Column(name = "category")
    private String category;
    @Column(name = "productNo")
    private  int productNo;
}
