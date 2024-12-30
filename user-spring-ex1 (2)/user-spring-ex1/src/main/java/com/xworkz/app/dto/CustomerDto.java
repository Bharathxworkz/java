package com.xworkz.app.dto;

import lombok.*;
import javax.persistence.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "customer_details_ex1")
@NamedQueries({
        @NamedQuery(name = "getUserById", query = "select user from CustomerDto user where user.id=:idd"),
        @NamedQuery(name = "getUserByName" , query = "select user from CustomerDto user where user.customerName=:namee"),
        @NamedQuery(name = "getAllUsers" , query = "select user from CustomerDto user"),
        @NamedQuery(name = "deleteUserById" , query = "delete from CustomerDto user where user.id=:idd")})

public class CustomerDto {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Id
    private int customerId;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "address")
    private String address;
}
