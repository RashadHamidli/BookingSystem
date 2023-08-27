package com.company.menu;

import com.company.controllers.UserController;
import com.company.entity.User;
import com.company.util.PrintUtil;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Login {
    UserController userController = new UserController();
    boolean b = false;

    public void login() {
        String userName = PrintUtil.getText("Enter username");
        String password = PrintUtil.getText("Enter password");
        User user = userController.getUser(userName, password);
        if (user == null) {
            System.out.println("login failed!");
        } else {
            System.out.println("login successfull\nWelcome " + user.getName() + " " + user.getSurname());
            b = true;
        }
    }

    public void displayUserMenu() {
        int choice = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            PrintUtil.userMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> System.out.println("sifaris 1");
                case 2 -> System.out.println("sifaris 2");
                case 3 -> System.out.println("sifaris 3");
                case 4 -> System.out.println("logout 4");
            }
        }
    }
}
