package com.user.service;

import com.user.model.User;
import com.user.model.UserInput;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService
{

    // fake service
    List<User> userList = List.of(
            new User(1l,"Bhumesh","12345"),
            new User(2l,"Ram","12345"),
            new User(3l,"Ankit","12345")
    );

    @Override
    public User getUser(Long userId)
    {
        return userList.stream().filter(user -> user.getId().equals(userId)).findAny().orElse(null);
    }

    @Override
    public User getUser(UserInput userInput)
    {
        return userList.stream().filter(user -> user.getId().equals(userInput.getUserId())).findAny().orElse(null);
    }
}
