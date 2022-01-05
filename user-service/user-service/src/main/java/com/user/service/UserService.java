package com.user.service;

import com.user.model.User;
import com.user.model.UserInput;

public interface UserService
{
    public User getUser(Long userId);

    public User getUser(UserInput userInput);
}
