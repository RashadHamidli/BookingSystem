package com.company.controllers;

import com.company.entity.User;
import com.company.services.UserService;

public class UserController {
    private UserService userService = new UserService();

    public User getUser(String userName, String password) {
        return userService.getUser(userName, password);
    }

    public boolean userRegister(User user) {
        return userService.userRegister(user);
    }
}
