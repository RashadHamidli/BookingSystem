package com.company.menu;

import com.company.util.PrintUtil;

import java.util.Scanner;

public class Menu {
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        Login login = new Login();
        Register register = new Register();

        while (true){
            PrintUtil.mainMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> login.login();
                case 2 -> register.userRegister();
                case 3 -> System.exit(0);
                default -> System.out.println("operation failed!");
            }
        }
    }
}
