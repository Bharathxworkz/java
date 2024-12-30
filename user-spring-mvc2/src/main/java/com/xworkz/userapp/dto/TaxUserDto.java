package com.xworkz.userapp.dto;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="tax_user_details")

@NamedQueries({
        @NamedQuery(name = "getAllTaxUsers", query="from TaxUserDto  taxUserDto"),
        @NamedQuery(name="deleteTaxUserById",query = "delete from TaxUserDto user where user.id=:idd"),
        @NamedQuery(name = "getTaxUserById" , query = "select user from TaxUserDto user where user.id=:idd")


})
public class TaxUserDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tax_user_id")
    private int id;
    @Column(name = "tax_user_firstName")
    private  String firstName;
    @Column(name = "tax_user_lastName")
    private String lastName;

    @Column(name = "tax_user_bankName")
    private  String bankName;
    @Column(name = "tax_user_phoneNumber")
    private  long phoneNumber;
    @Column(name = "tax_user_income")
    private  int income;
}
