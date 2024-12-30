package com.xworkz.userapp.dto;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "spring_core_ex2")
@NamedQueries({
        @NamedQuery(name = "getSuperMarketDetailsById" , query = "select super from SuperMarketDto super where super.productId=:idd"),
        @NamedQuery(name = "getSuperMarketDetailsByName" , query = "select super from SuperMarketDto super where super.productName=:namee"),
        @NamedQuery(name = "getAllUsers" , query = "select super from SuperMarketDto super"),
        @NamedQuery(name = "deleteSuperMarketById" , query = "delete from SuperMarketDto super where super.productId=:idd"),
        @NamedQuery(name = "getPriceById" , query = "select super.productPrice from SuperMarketDto super where super.productId=:i"),
        @NamedQuery(name = "getProductNameAndProductCategoryById" , query = "select super.productName , super.productCategory from SuperMarketDto super where super.productId=:i"),
        @NamedQuery(name = "getProductNameAndProductCategoryByManufactureDate" , query = "select super.productName , super.productCategory from SuperMarketDto super where super.manufactureDate=:mn"),
        @NamedQuery(name = "updatePriceByProductName" , query = "update SuperMarketDto super set super.productPrice=:pr where super.productName=:pn")
})

public class SuperMarketDto {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    @Id
    private int productId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_price")
    private int productPrice;
    @Column(name = "product_category")
    private String productCategory;
    @Column(name = "manufacture_date")
    private String manufactureDate;
    @Column(name = "expiry_date")
    private String expiryDate;
}
