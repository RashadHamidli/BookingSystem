package com.company.menu;

import com.company.controllers.UserController;
import com.company.database.DataBase;
import com.company.entity.User;
import com.company.util.PrintUtil;

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
                case 1 -> System.out.println("ucuslarin siyahisi gosterilecek");
                case 2 -> System.out.println("ucus axtarilacaq");
                case 3 -> System.out.println("sizin biletler burada olacaq");
                case 4 -> System.out.println("bileti cancel edilecek");
                case 5 -> {
                    System.out.println("logout successfuly");
                    login();
                }
                case 6 -> {
                    System.out.println("System exit");
                    DataBase dataBase=DataBase.getInstance();
                    dataBase.getUsers().stream().forEach(System.out::println);
                    System.exit(0);
                }
                default -> System.out.println("emeliyyati duzgun daxil edin");
            }
        }
    }
}
