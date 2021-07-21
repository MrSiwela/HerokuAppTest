package com.heroku.demoapp.controller;

import com.heroku.demoapp.entity.Contact;
import com.heroku.demoapp.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    @Autowired
    private ContactService service;

    @GetMapping("/")
    public List<Contact> getAllContacts(){
        return service.getAllContacts();
    }

    @PostMapping("/")
    public Contact addContact(@RequestBody Contact contact){
        return service.addContact(contact);
    }

    @DeleteMapping("/{id}")
    public String deleteContact(@PathVariable int id){
        return service.deleteContact(id);
    }

}
