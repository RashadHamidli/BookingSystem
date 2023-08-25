package com.company.controllers;


import com.company.entity.User;
import com.company.services.UserService;

public class UserController {
    private UserService userService = new UserService();

    public User getUser(String username, String password){
        return userService.getUser(username, password);
    }
    public boolean isPasswordExist(String password){
        return userService.isPasswordExist(password);
    }

    public boolean registerUser(User user){
        return userService.registerUser(user);
    }

    public boolean getUserLogin(String username, String password){
        return userService.getUserLogin(username, password);
    }
}
