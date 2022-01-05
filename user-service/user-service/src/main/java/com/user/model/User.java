package com.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User
{
    private Long id;
    private String name;
    private String phone;
    private List<Contact> contactList = new ArrayList<>();

    public User(Long id, String name, String phone)
    {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }
}
