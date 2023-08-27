package com.company.util;

import java.util.Scanner;

public class PrintUtil {
    public static void mainMenu() {
        System.out.println("1. Login" +
                "\n2. Register" +
                "\n3. Flight lists" +
                "\n4. Exit");
    }

    public static void userMenu() {
        System.out.println("1. View flights" +
                "\n2. Search booking" +
                "\n3. Make booking" +
                "\n4. View booking list" +
                "\n5. Cancel booking" +
                "\n6. logout" +
                "\n7. Exit");
    }

    public static String getText(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s: ", text);
        return scanner.nextLine();
    }

    public static int getNum(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s: ", text);
        return scanner.nextInt();
    }
}
