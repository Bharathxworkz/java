package com.xworkz.app.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
@Getter
@Setter
@Entity
@EqualsAndHashCode(exclude = "userEntity1")
@ToString(exclude = "userEntity1")
@Table(name = "retailer")
public class AddRetailerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String retailerName;
    private long contactNumber;
    private String email;
    private String gstin;
    private String address;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "medisales_id") // Foreign key
    private UserEntity userEntity1;

    @Transient
    private Integer medisalesId;
}
