package com.company.menu;

import com.company.controllers.UserController;
import com.company.database.DataBase;
import com.company.entity.User;
import com.company.util.PrintUtil;

public class Register {
    UserController userController = new UserController();

    public void userRegister() {
        String userName = PrintUtil.getText("Enter username");
        String name = PrintUtil.getText("Enter name");
        String surname = PrintUtil.getText("Enter surname");
        String password = PrintUtil.getText("Enter password");

        boolean registered = userController.userRegister(new User(userName, name, surname, password, null));
        if (!registered) {
            System.out.println("register failed!");
        } else {
            System.out.println("Register successfuly");
            DataBase dataBase = DataBase.getInstance();
            dataBase.writeFileDatabase();
        }

    }
}
