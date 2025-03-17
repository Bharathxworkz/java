package com.xworkz.app.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Data
@Table(name = "distributor_table")
@NamedQuery(name = "getAllUsers" , query = "from DistributorEntity entity")
@NamedQuery(name = "deleteStockById" , query = "delete from DistributorEntity entity where entity.id=:idd")
@NamedQuery(name = "getStockById" ,query = "select entity from DistributorEntity entity where entity.id=:idd")
public class DistributorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

   /* @OneToMany(mappedBy = "distributor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AddVendorEntity> vendors;*/

    @Column(name = "product_company")
    private String productCompany;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "hsn")
    private long hsn;
    @Column(name = "mrp")
    private long mrp;
    @Column(name = "pack")
    private long pack;
    @Column(name = "batch_number")
    private String batchNumber;
    @Column(name = "mfg_date")
    private LocalDate mfgDate;
    @Column(name = "expiry_date")
    private LocalDate expiryDate;
    @Column(name = "qty")
    private int qty;
    @Column(name = "rate")
    private long rate;
    @Column(name = "discount")
    private int discount;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "created_date")
    private LocalDate createdDate;
    @Column(name = "updated_by")
    private  String updatedBy;
    @Column(name = "updated_date")
    private LocalDate updatedDate;
    @Column(name = "gst")
    private Double gst;
    @Column(name = "total_amount")
    private Double amount;

}
