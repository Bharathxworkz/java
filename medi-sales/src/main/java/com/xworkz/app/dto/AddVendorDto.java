package com.xworkz.app.dto;

import com.xworkz.app.entity.DistributorEntity;
import lombok.*;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AddVendorDto {
    private int id;
    private String vendorName;
    private long contactNumber;
    private String email;
    private String gstin;
    private String address;
    private Integer medisalesId;



}
