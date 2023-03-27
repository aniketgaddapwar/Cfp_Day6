package com.springboot.address_Book_Backend.entity;

import com.springboot.address_Book_Backend.dto.AddressBookDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name="Address_Book_Table")
public class AddressBook {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String state;

    @Column
    private long pincode;

public AddressBook(AddressBookDTO addressBookDTO){
    this.name = addressBookDTO.getName();
    this.phoneNumber = addressBookDTO.getPhoneNumber();
    this.email = addressBookDTO.getEmail();
    this.address = addressBookDTO.getAddress();
    this.city = addressBookDTO.getCity();
    this.state = addressBookDTO.getState();
    this.pincode = addressBookDTO.getPincode();
}

}
