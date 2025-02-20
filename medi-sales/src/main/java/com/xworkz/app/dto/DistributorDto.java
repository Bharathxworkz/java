package com.xworkz.app.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data

public class DistributorDto {
    private int id;
    private String productCompany;
    private String productName;
    private long hsn;
    private long mrp;
    private long pack;
    private String batchNumber;
    private String mfgDate;
    private String expiryDate;
    private int qty;
    private long rate;
    private int discount;
    private String createdBy;
    private LocalDate createdDate;
    private  String updatedBy;
    private LocalDate updatedDate;
    private Double gst;
    private Double amount;
}
