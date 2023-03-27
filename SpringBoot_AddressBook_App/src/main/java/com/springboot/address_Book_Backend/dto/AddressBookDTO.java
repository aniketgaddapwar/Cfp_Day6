package com.springboot.address_Book_Backend.dto;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddressBookDTO {

    private int id;

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = " length of name cant be less than 3 ")
    private String name;

   @Pattern(regexp = "^[1-9]{2}[0-9]{10}$",message = "Phone number should be with countrycode")
    private String phoneNumber;

    @Email(message = "Follow The Proper Email format")
    private String email;

    @NotBlank(message = "Address cannot be empty")
    private String address;


    @NotBlank(message = "City cannot be empty")
    private String city;

    @NotBlank(message = "State cannot be empty")
    private String state;

    private long pincode;


}
