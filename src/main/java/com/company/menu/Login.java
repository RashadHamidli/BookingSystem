package com.company.menu;

import com.company.controllers.UserController;
import com.company.entity.User;
import com.company.util.PrintUtil;

import java.sql.SQLOutput;

public class Login {
    UserController userController = new UserController();

    public void login() {
        String userName = PrintUtil.getText("Enter username");
        String password = PrintUtil.getText("Enter password");
        User user = userController.getUser(userName, password);
        if (user == null) {
            System.out.println("login failed!");
        } else {
            System.out.println("login successfull");
        }
    }
}
