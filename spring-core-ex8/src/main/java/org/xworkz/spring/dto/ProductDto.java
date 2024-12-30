package org.xworkz.spring.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "product_table")
public class ProductDto {
    @Id
    @GenericGenerator(name = "prodGen", strategy = "increment")
    @GeneratedValue(generator = "prodGen")
    @Column(name = "id")
    private int id;

    @Column(name = "productName")
    private String productName;

    @Column(name = "price")
    private double price;

    @Column(name = "quantity")
    private int quantity;
}
