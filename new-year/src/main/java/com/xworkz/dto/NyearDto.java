package com.xworkz.dto;

import lombok.*;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@ToString
public class NyearDto {

    private int id;

    @NotEmpty(message = "First name should not be empty")
    @Size(min = 3, max = 15, message = "First name must contain between 3 and 15 characters")
    private String firstName;

    private String lastName;

    @NotEmpty(message = "Email should not be empty")
    @Size(min = 3, max = 50, message = "Email must contain 3 characters")
    @Pattern(regexp = "^\\S+@\\S+\\.\\S+$", message = "Invalid email format")
    private String email;

    @NotEmpty(message = "Alternate email should not be empty")
    @Size(min = 3, max = 20, message = "Alternate email must contain between 3 and 20 characters")
    @Pattern(regexp = "^\\S+@\\S+\\.\\S+$", message = "Invalid alternate email format")
    private String alternateEmail;

    @NotNull(message = "Contact number should not be empty")
    @Digits(integer = 10, fraction = 0, message = "Contact number must have 10 digits")
  //  @Pattern(regexp = "^[6-9]\\d{9}$", message = "Contact number must start with 6-9 and have 10 digits")
    private Long contact;

    @NotNull(message = "Alternate contact number should not be empty")
    @Digits(integer = 10, fraction = 0, message = "Alternate contact number must have 10 digits")
   // @Pattern(regexp = "^[6-9]\\d{9}$", message = "Alternate contact number must start with 6-9 and have 10 digits")
    private Long alternateContact;

    @NotEmpty(message = "Date of birth should not be empty")
    private String dateOdBirth;

    @NotEmpty(message = "Place should not be empty")
    private String place;

    @NotEmpty(message = "State should not be empty")
    private String state;

    @NotEmpty(message = "District should not be empty")
    private String district;

    @NotEmpty(message = "Password should not be empty")
    @Size(min = 3, max = 15, message = "Password must contain between 3 and 15 characters")
    private String password;

    @NotEmpty(message = "Confirm password should not be empty")
    @Size(min = 3, max = 15, message = "Confirm password must contain between 3 and 15 characters")
    private String confirmPassword;

    private String createdBy;
    private LocalDate createdTime;
    private String updatedBy;
    private LocalDate updatedTime;
    private String fileName;
    private String contentType;
    private int attemptlogin;
}
