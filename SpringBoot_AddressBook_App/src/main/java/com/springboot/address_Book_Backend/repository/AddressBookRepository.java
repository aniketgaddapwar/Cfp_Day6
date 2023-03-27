package com.springboot.address_Book_Backend.repository;

import com.springboot.address_Book_Backend.entity.AddressBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBook,Long> {
}
