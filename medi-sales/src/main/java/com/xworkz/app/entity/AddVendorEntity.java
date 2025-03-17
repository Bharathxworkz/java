package com.xworkz.app.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@EqualsAndHashCode(exclude = "userEntity")
@ToString(exclude = "userEntity")
@Table(name = "vecca")
public class AddVendorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String vendorName;
    private long contactNumber;
    private String email;
    private String gstin;
    private String address;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "medisales_id") // Foreign key
    private UserEntity userEntity;

    @Transient
    private Integer medisalesId;
}
