package com.company.services;

import com.company.dao.UserDao;
import com.company.entity.User;

public class UserService {
    private UserDao userDao=new UserDao();

    public User getUser(String username, String password) {
        return userDao.getAll().stream().filter(u -> u.getUserName().equals(username) && u.getPassword().equals(password)).findFirst().orElse(null);
    }
}
