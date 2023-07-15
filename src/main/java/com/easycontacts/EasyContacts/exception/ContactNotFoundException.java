package com.easycontacts.EasyContacts.exception;

public class ContactNotFoundException extends RuntimeException{
    public ContactNotFoundException(Long id){
        super("The contact with the ID " + id + " has not been found...");
    }

}
