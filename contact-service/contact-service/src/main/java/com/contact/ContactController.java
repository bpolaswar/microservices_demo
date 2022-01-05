package com.contact;

import com.contact.model.Contact;
import com.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/contact")
public class ContactController
{
    @Autowired
    private ContactService contactService;

    @RequestMapping("/user/{userId}")
    public List<Contact> getContactByUserId(@PathVariable("userId") Long userId)
    {
return contactService.getContactByUser(userId);
    }
}
