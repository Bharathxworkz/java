package com.xworkz.app.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AddRetailerDto {
    private int id;
    private String retailerName;
    private long contactNumber;
    private String email;
    private String gstin;
    private String address;
    private Integer medisalesId;
}
