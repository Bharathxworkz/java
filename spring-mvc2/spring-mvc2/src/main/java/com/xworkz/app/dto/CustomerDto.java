package com.xworkz.app.dto;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "spring_mvc_customer_details")
@NamedQuery(name = "getAllUsers" , query = "from CustomerDto customer")
@NamedQuery(name = "deleteCustomer" , query = "delete from CustomerDto customer where customer.id=:idd")
@NamedQuery(name = "getUserById" , query = "select customer from CustomerDto customer where customer.id=:idd")
public class CustomerDto {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "phone_number")
    private long phoneNumber;
    @Column(name = "age")
    private int age;
    @Column(name = "address")
    private String address;

}
