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
@Table(name = "amazon_table")
public class AmazonDto {

    @Id
    @GenericGenerator(name = "abhi",strategy = "increment")
    @GeneratedValue(generator = "abhi")
    @Column(name = "id")
    private int id;
    @Column(name = "product_Name")
    private String productName;
    @Column(name = "product_Quality")
    private String productQuality;
    @Column(name = "product_price")
    private String productPrice;
}
