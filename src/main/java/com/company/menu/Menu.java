package com.company.menu;

import com.company.database.DataBase;
import com.company.entity.Flight;
import com.company.entity.User;
import com.company.util.PrintUtil;

import java.util.List;
import java.util.Scanner;

public class Menu {
    public void displayMenu() {
        DataBase db = DataBase.getInstance();
        List<User> users = db.getUsers();
        List<Flight> flights = db.getFlights();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        Login login = new Login();
        Register register = new Register();
        boolean b = true;
        while (b) {
            PrintUtil.mainMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    login.login();
//                    if (login.b == true) {
////                        users.clear();
////                        db.writeFileDatabase();
//                        login.displayUserMenu(user);
//                    }
                }
                case 2 -> register.userRegister();
                case 3 -> flights.forEach(System.out::println);
                case 4 -> System.exit(0);
                default -> System.out.println("operation failed!");
            }
        }
    }
}
