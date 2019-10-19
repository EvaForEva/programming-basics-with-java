package com.company;

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String password = scanner.nextLine();
        String checkPassword = scanner.nextLine();

        while (!password.equals(checkPassword)) {
            checkPassword = scanner.nextLine();
        }

        System.out.printf("Welcome %s!", name);
    }

}
