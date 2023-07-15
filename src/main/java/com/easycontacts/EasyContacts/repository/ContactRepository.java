package com.easycontacts.EasyContacts.repository;

import com.easycontacts.EasyContacts.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact,Long> {
}
