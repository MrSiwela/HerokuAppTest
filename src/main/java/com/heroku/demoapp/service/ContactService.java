package com.heroku.demoapp.service;

import com.heroku.demoapp.entity.Contact;
import com.heroku.demoapp.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    @Autowired
    private ContactRepository repository;

    public List<Contact> getAllContacts(){
        return repository.findAll();
    }

    public Contact addContact(Contact contact){
        return repository.save(contact);
    }

    public String deleteContact(int id){
        repository.deleteById(id);
        return "Contact Deleted";
    }
}
