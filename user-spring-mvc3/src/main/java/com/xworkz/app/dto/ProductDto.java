package com.xworkz.app.dto;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="product_data")

@NamedQueries({
        @NamedQuery(name = "getAllProducts", query="from ProductDto  productDto"),
        @NamedQuery(name="deleteProductById",query = "delete from ProductDto user where user.id=:idd"),
        @NamedQuery(name = "getUserById" , query = "select user from ProductDto user where user.id=:idd")

})
public class ProductDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int id;
    @Column(name = "product_name")
    private  String productName;
    @Column(name = "product_catagory")
    private String productCatagory;

    @Column(name = "product_color")
    private  String productColor;
    @Column(name = "product_price")
    private  double productPrice;

}
