package com.user.controller;

import com.user.model.Contact;
import com.user.model.User;
import com.user.model.UserInput;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController
{
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserService userService;

    @GetMapping(value = "/{userId}")
    public User getUser(@PathVariable("userId") Long userId)
    {
        User user = userService.getUser(userId);
        //http://localhost:9002/contact/user/1
       List<Contact> contactList = restTemplate.getForObject("http://contact-service/contact/user/1", List.class);
        user.setContactList(contactList);
        return user;
    }

    @GetMapping(value = "/getuser-by-get")
    public User getUser(@RequestBody UserInput userInput)
    {
        return userService.getUser(userInput);
    }

    @PostMapping(value = "/getuser-by-post")
    public User getUserByPost(@RequestBody UserInput userInput)
    {
        return userService.getUser(userInput);
    }
}
