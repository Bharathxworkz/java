package com.xworkz.app.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Setter
@Getter

@EqualsAndHashCode(exclude = "vendorEntityList")
@ToString(exclude = "vendorEntityList")
@Table(name = "medic")
@NamedQuery(name = "checkEmailPassword", query = "select entity from UserEntity entity where entity.email=:email")
@NamedQuery(name = "checkEmail" , query = "select count(entity) from UserEntity entity where entity.email=:email")
@NamedQuery(name = "getAllDistributor", query = "SELECT entity.contactPerson FROM UserEntity entity WHERE entity.businessType=:businessType")
@NamedQuery(name = "getDtoByEmail",query = "select entity from UserEntity entity where entity.email=:email")
@NamedQuery(name = "getVendorNamesByUserId",
        query = "SELECT v.vendorName FROM AddVendorEntity v WHERE v.userEntity.id = :id")
@NamedQuery(name = "getAllVendors", query = "from AddVendorEntity entity where entity.userEntity.id=:id")


public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="medisales_id")
    private int id;

    private String companyName;
    private String contactPerson;
    private String businessType;
    private long mobile;
    private String email;
    private String address1;
    private String address2;
    private long pincode;
    private String referral;
    private String password;
    private String confirmPassword;
    private String createdBy;
    private LocalDate createdDate;
    private String updatedBy;
    private LocalDate updatedDate;
    private String otp;
    private String fileName;
    private String contentType;

    @OneToMany(mappedBy = "userEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AddVendorEntity> vendorEntityList;

    @OneToMany(mappedBy = "userEntity1", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AddRetailerEntity> retailerEntityList;
}
