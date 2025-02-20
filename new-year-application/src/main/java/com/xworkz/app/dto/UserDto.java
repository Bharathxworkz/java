package com.xworkz.app.dto;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@ToString
public class UserDto {

    private Integer id;
    @NotNull(message = "First name can't be empty")
    @Size(min = 3,max = 20,message = "First name should be minimun 3 character and maximum 20 character")
    private String fName;
    @NotNull(message = "Last name can't be empty")
    @Size(min = 3,max = 20,message = "Last name should be minimun 3 character and maximum 20 character")
    private String lName;
    @NotNull(message = "Email can't be empty")
    @Size(min = 5,max = 30,message = "Email should be atleast 5")
    private String email;
    @NotNull(message = "Alternalte email can't be empty")
    @Size(min = 5,max = 30,message = "Alternalte email should be atleast 5 ")
    private String alterEmail;
    @NotNull(message = "Mobile number can't be empty")
    private Long contactNumber;
    @NotNull(message = "Alternate mobile number can't be empty")
    private Long alterContactNumber;
    @NotNull(message = "Date Of birth can't be empty")
    private String dateOfBirth;
    @NotNull(message = "Place can't be empty")
    @Size(min=3,max = 30, message = "place should should be atleast 3")
    private String place;
    @NotNull(message = "State can't be empty")
    @Size(min=3,max = 30, message = "State should should be atleast 3")
    private String state;
    @NotNull(message = "District can't be empty")
    @Size(min=3,max = 30, message = "District should should be atleast 3")
    private String district;
    @NotNull(message = "Password can't be empty")
    @Size(min=3,max = 20, message = "Password should should be atleast 3")
    private String password;
    @NotNull(message = "Confirm Passsword can't be empty")
    @Size(min=3,max = 30, message = "Confirm Password should should be atleast 3")
    private String confirmPassword;
    private String cratedBy;
    private LocalDate createdTime;
    private String updatedBy;
    private LocalDate updatedTime;
    private String fileName;
    private String contentType;
    private int attempt;
    private String otp;
}
