package com.company.menu;

import java.util.Scanner;

public class MenuBar {
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
