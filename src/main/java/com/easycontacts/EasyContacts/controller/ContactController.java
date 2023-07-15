package com.easycontacts.EasyContacts.controller;

import com.easycontacts.EasyContacts.exception.ContactNotFoundException;
import com.easycontacts.EasyContacts.model.Contact;
import com.easycontacts.EasyContacts.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @PostMapping("/add-contact")
    Contact newContact(@RequestBody Contact newContact){
        return contactRepository.save(newContact);
    }

    @GetMapping("/contacts")
    List<Contact> getAllContacts(){
        return contactRepository.findAll();
    }

    @GetMapping("/contact/{id}")
    Contact getContactById(@PathVariable Long id){
        return contactRepository.findById(id)
                .orElseThrow(() -> new ContactNotFoundException(id));
    }

    @PutMapping("/contact/{id}")
    Contact updateContact(@RequestBody Contact newContact, @PathVariable Long id){
        return contactRepository.findById(id)
                .map(contact -> {
                    contact.setName(newContact.getName());
                    contact.setNumber(newContact.getNumber());
                    contact.setEmail(newContact.getEmail());
                    return contactRepository.save(contact);
                }).orElseThrow(() -> new ContactNotFoundException(id));
    }

    @DeleteMapping("/contact/{id}")
    String deleteContact(@PathVariable Long id){
        if(!contactRepository.existsById(id)){
            throw new ContactNotFoundException(id);
        }
        contactRepository.deleteById(id);
        return "The contact with the ID " + id + " has been deleted!";
    }
}


