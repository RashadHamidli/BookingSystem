package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<User> list = new ArrayList();
        int i;
        while (true) {
            System.out.println("1. Login");
            System.out.println("2. Registration");
            System.out.println("3. Information");
            System.out.println("4. Logout");
            switch (i = scanner.nextInt()) {
                case 1 -> {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter the name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter the surname: ");
                    String surname = sc.nextLine();
                    if (name.equals("") && surname.equals("")) {
                        System.out.println("Login successffuly");
                    } else {
                        System.out.println("User not found!");
                        System.out.println(name + surname);
                    }
                }
                case 2 -> {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter the name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter the surname: ");
                    String surname = sc.nextLine();
                    list.add(new User(name, surname));
                    System.out.println("Registration successffuly");
                }

                case 3 -> System.out.println("Information not found");
                case 4 -> {
                    System.exit(0);
                    System.out.println("Logout successffuly");
                }
            }
        }
    }
}