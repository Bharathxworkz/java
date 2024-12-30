package com.xworkz.car.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
@Table(name = "car_details")
@NamedQueries({
@NamedQuery(name = "getAllDetails",query = "select user from CarDto user"),
@NamedQuery(name = "DeleteUserById",query = "delete from CarDto dto where dto.id =: id"),
@NamedQuery(name = "getNameByModel",query = "select user.name from CarDto user where user.model =: model"),
@NamedQuery(name = "getNameByPrice",query = "select user.name from CarDto user where user.price =: price"),
@NamedQuery(name = "getNameModelByPrice",query = "select user.name, user.model from CarDto user where user.price =: price"),
@NamedQuery(name = "updateNameByModel",query = "update CarDto dto set dto.name =: name where dto.model =: model"),
@NamedQuery(name = "deleteBookByName",query = "delete CarDto dto where dto.name=:name")
})
public class CarDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private int id;
    @Column(name = "car_name")
    private String name;
    @Column(name = "car_price")
    private double price;
    @Column(name = "car_model")
    private String model;
}
