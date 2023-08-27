package com.company;

import com.company.database.DataBase;
import com.company.entity.User;
import com.company.menu.Menu;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        DataBase dataBase = DataBase.getInstance();
//        dataBase.initDatabase();
////        dataBase.closeDatabase();
//        Menu menu = new Menu();
//        menu.displayMenu();
        List<User> users = DataBase.getInstance().getUsers();
        users.add(new User("a","a","a","a"));
        users.add(new User("a","a","a","a"));
        users.add(new User("a","a","a","a"));

        for (User u : users) {
            System.out.println(u.getId());
        }
    }
}
