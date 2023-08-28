package com.company.menu;

import com.company.controllers.UserController;
import com.company.database.DataBase;
import com.company.entity.Flight;
import com.company.entity.User;
import com.company.util.PrintUtil;

import java.util.List;
import java.util.Scanner;

public class Login {
    UserController userController = new UserController();

    public void login() {
        String userName = PrintUtil.getText("Enter username");
        String password = PrintUtil.getText("Enter password");
        User user = userController.getUser(userName, password);
        if (user == null) {
            System.out.println("login failed!");
        } else {
            System.out.println("login successfull\nWelcome " + user.getName() + " " + user.getSurname());
            displayUserMenu(user);
        }
    }

    public void displayUserMenu(User user) {
        DataBase db = DataBase.getInstance();
        List<Flight> flights = db.getFlights();
        Book book = new Book();
        int choice = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            PrintUtil.userMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> flights.forEach(System.out::println);
                case 2 -> book.searchFlight().forEach(System.out::println);
                case 3 -> {
                    System.out.println("enter the flight code");
                    String code = scanner.nextLine();
                    book.makeBooking(user, code);
                }
                case 4 -> {
                    book.showBooking(user);
                    DataBase dataBase = DataBase.getInstance();
                    dataBase.getBookings().stream().forEach(System.out::println);
                }
                case 5 -> book.cancelBooking(user.getId());
                case 6 -> {
                    System.out.println("logout successfuly");
                    login();
                }
                case 7 -> {
                    System.out.println("System exit");
                    DataBase dataBase = DataBase.getInstance();
                    dataBase.getUsers().stream().forEach(System.out::println);
                    System.exit(0);
                }
                default -> System.out.println("emeliyyati duzgun daxil edin");
            }
        }
    }
}
