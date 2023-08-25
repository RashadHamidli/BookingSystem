package com.company;


import com.company.database.DataBase;
import com.company.menu.Menu;

public class Main {
    public static void main(String[] args) {
        DataBase db = DataBase.getInstance();
        db.initDatabase();
        Menu menu = new Menu();
        menu.displayMainMenu();
        db.closeDatabase();
    }


}

