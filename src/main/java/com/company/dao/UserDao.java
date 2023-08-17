package com.company.dao;

import com.company.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UserDao {
    private static List<User> list = new ArrayList<>();

    private static Scanner scanner = new Scanner(System.in);

    public static void menuMain() {
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
                    for (User user : list) {
                        if (name.equals(user.getName()) && surname.equals(user.getSurname())) {
                            System.out.println("Login successffuly\nWelcome " + user.getName() + " " + user.getSurname());
                            menuShow();
                        } else {
                            System.out.println("User not found!");
                        }
                    }
                    System.out.println("bura catdi");
                }
                case 2 -> {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter the name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter the surname: ");
                    String surname = sc.nextLine();
                    if(list.isEmpty()){
                        list.add(new User(name, surname));
                        System.out.println("Registration successffuly aaa");
                    }else{
                        for(User user:list){
                            if(name.equals(user.getName()) && surname.equals(user.getSurname())){
                                System.out.println("istifadeci artiq movcuddur");
                            }
                            System.out.println("Registration successffuly bbb");
                        }
                        list.add(new User(name, surname));
                    }

//                    Scanner sc = new Scanner(System.in);
//                    System.out.print("Enter the name: ");
//                    String name = sc.nextLine();
//                    System.out.print("Enter the surname: ");
//                    String surname = sc.nextLine();
//                    list.add(new User(name, surname));
//                    System.out.println("Registration successffuly");

                }

                case 3 -> System.out.println("Information not found");
                case 4 -> {
                    System.exit(0);
                    System.out.println("Logout successffuly");
                }
            }
        }
    }

    public static void menuShow() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Show ticket");
        System.out.println("2. Show history");
        System.out.println("3. Information");
        System.out.println("4. Logout");
        int i;
        while (true) {
            switch (i = scanner.nextInt()) {
                case 1 -> System.out.println("ticket lists");
                case 2 -> System.out.println("history reys");
                case 3 -> System.out.println("information not found");
                case 4 -> {
                    System.out.println("exit successffuly");
                    return;
                }
            }
        }
    }
}
