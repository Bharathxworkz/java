package com.xworkz.product.dto;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "product_details")
@NamedQueries({
@NamedQuery(name = "deleteProductId",query = "delete from ProductDto dto where id = :id"),
@NamedQuery(name = "updatePriceByName",query="update ProductDto dto set dto.productPrice =: price where dto.productName =: name"),
@NamedQuery(name = "getAllDetails",query = "select user from ProductDto user"),
@NamedQuery(name = "getPriceByName",query = "select user.productPrice from ProductDto user where user.productName =: name"),
@NamedQuery(name = "getCategoryRatingsByName",query = "select user.ratings, user.category from ProductDto user where user.productName =: name"),
@NamedQuery(name = "updateCategoryByPrice",query = "update ProductDto dto set dto.category =: category where dto.productPrice =: price"),
@NamedQuery(name = "deleteProductByPrice",query = "delete from ProductDto dto where dto.productPrice =: price")
})

public class ProductDto {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "ref",strategy = "increment")
    @GeneratedValue(generator = "ref")
    @Column(name = "id")
    private  int id;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "category")
    private String category;
    @Column(name = "product_price")
    private  double productPrice;
    @Column(name = "ratings")
    private double ratings;
}
