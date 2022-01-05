package com.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact
{
    private Long cId;
    private String name;
    private String email;
    private Long userId;
}
