package com.company.menu;



import com.company.controllers.UserController;
import com.company.entity.User;
import com.company.utils.PrintUtil;

import java.util.ArrayList;

import static com.company.utils.PasswordUtil.validatePassword;


public class Register {
    UserController userController = new UserController();

    public void registerUser(){

        String username = PrintUtil.getText("Enter username");
        String name = PrintUtil.getText("Enter name");
        String surname = PrintUtil.getText("Enter surname");
        String password = PrintUtil.getText("Enter password.(Contains at least 1 special character or 1 number '!#$%&'()*+,-./:;<=>?@[]^_`{|}~0123456789')");

        while(!validatePassword(password) || userController.isPasswordExist(password)){
            password = PrintUtil.getText("Enter valid password!");
        }
        boolean isRegister = userController.registerUser(new User(username, name, surname, password, new ArrayList<>()));

        if(!isRegister){
            System.out.print("Register failed\n");
        }
        else{
            System.out.print("Register successful\n");
        }
    }

}
