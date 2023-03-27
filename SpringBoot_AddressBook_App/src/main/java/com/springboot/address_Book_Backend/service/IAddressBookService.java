package com.springboot.address_Book_Backend.service;

import com.springboot.address_Book_Backend.dto.AddressBookDTO;
import com.springboot.address_Book_Backend.entity.AddressBook;

import java.util.List;
import java.util.Optional;

public interface IAddressBookService {
    List<AddressBook> showDetails();

    Optional<AddressBook> showById(long id);

    AddressBook empData(AddressBookDTO addressBookDTO);

    AddressBook updateData(AddressBookDTO addressBookDTO, long id);


    String deleteData(long id);

}
