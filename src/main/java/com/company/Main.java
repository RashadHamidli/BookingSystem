package com.company;

import com.company.database.DataBase;
import com.company.menu.Menu;

public class Main {
    public static void main(String[] args) {
        DataBase dataBase = DataBase.getInstance();
        dataBase.read();
        Menu menu = new Menu();
        menu.displayMenu();
        dataBase.write();
    }
}
