package com.company;

import java.util.Scanner;

public class GreetingsByName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();

        System.out.printf("Hello, %s %s, a %d-years old person from %s.", firstName, lastName, age, town);
    }
}