package com.contact.service;

import com.contact.model.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService
{

    //fake contact list
    List<Contact> contactList = List.of(
            new Contact(100L,"anil","anil@gmail.com",1L),
            new Contact(101L,"rahul","rahul@gmail.com",1L),
            new Contact(102L,"rohan","rohan@gmail.com",2L),
            new Contact(104L,"summit","sumit@gmail.com",3L)
    );

    @Override
    public List<Contact> getContactByUser(Long userId)
    {
        return contactList.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
