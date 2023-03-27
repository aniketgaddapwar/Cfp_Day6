package com.springboot.address_Book_Backend.exception;

public class AddressBookException extends RuntimeException {
    public AddressBookException(String message){
        super(message);
    }
}
