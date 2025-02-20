package com.xworkz.app.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SaleDTO {

    private String productName;
    private String customerName;
    private double rate;

    private long hsn;
    private String batchNumber;
    private long mrp;;
    private int discount;
    private Double gst;
    private int qty;
    private Double amount;}
