package com.xworkz.app.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Data
@Table(name = "vendor_tableeee")
@NamedQuery(name = "getAllvendor" , query = "from  VendorEntity entity")
@NamedQuery(name = "deleteeStockById" , query = "delete from VendorEntity entity where entity.id=:idd")
@NamedQuery(name = "findByCustomerAndProduct",
        query = "SELECT entity FROM VendorEntity entity WHERE entity.customerName = :customerName AND entity.productName = :productName")


public class VendorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment for primary key
    @Column(name = "id") // Maps to the 'id' column in the database
    private int id;

    @Column(name = "product_name", nullable = false)
    private String productName;

    private long rate;


    @Column(name = "customer_name", nullable = false)
    private String customerName;

    @Column(name = "hsn", nullable = false)
    private long hsn;

    @Column(name = "batch_number", nullable = false)
    private String batchNumber;

    @Column(name = "mrp")
    private long mrp;

    @Column(name = "discount", nullable = false)
    private int discount;

    @Column(name = "gst", nullable = false)
    private Double gst;

    @Column(name = "qty", nullable = false)
    private int qty;

    @Column(name = "amount", nullable = false)
    private Double amount;
}