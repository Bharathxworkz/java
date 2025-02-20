package com.xworkz.app.dto;

import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {
    private int id;
    @NotNull(message = "company name  should not null")
    @Size(min=3,max = 20,message = "company name  should be min 3 character  max 20")
    private String companyName;
    @NotNull(message = "contact person should not null")
    @Size(min=3,max = 50,message = "contact person be min 3 character  max 50")
    private String contactPerson;
    @NotNull(message = "business type should not null")
    @Size(min=3,max = 50,message = "business type be min 7 character  max 50")
    private String businessType;
    @NotNull(message = "mobile should not be null")
    @Min(value = 1000000000L, message = "mobile should be a valid 10-digit number")
    @Max(value = 9999999999L, message = "mobile should be a valid 10-digit number")
    private  long mobile;
    @NotNull(message = "email should not null")
    @Size(min=3,max = 50,message = "email should be min 3 character  max 50")
    private  String email;
    @NotNull(message = "address1 should not null")
    @Size(min=3,max = 50,message = "address1 should be min 3 character  max 50")
    private  String address1;
    @NotNull(message = "address2 should not null")
    @Size(min=3,max = 50,message = "address2 should be min 3 character  max 50")
    private  String address2;
    @NotNull(message = "pincode should not be null")
    @Min(value = 100000L, message = "pincode should be a valid 6-digit number")
    @Max(value = 999999L, message = "pincode should be a valid 6-digit number")
    private  long pincode;
    @NotNull(message = "referral should not null")
    @Size(min=3,max = 50,message = "referral should be min 3 character  max 50")
    private  String referral;
    @NotNull(message = "password should not null")
    @Size(min=3,max = 20,message = "password should be min 3 character  max 20")
    private  String password;
    @NotNull(message = "confirmPassword should not null")
    @Size(min=3,max = 20,message = "confirmPassword should be min 3 character  max 20")
    private  String confirmPassword;
    private String createdBy;
    private LocalDate createdDate;
    private  String updatedBy;
    private LocalDate updatedDate;
    private String fileName;
    private String contentType;
    private String otp;
}
