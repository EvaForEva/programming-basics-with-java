package com.company;

import java.util.Scanner;

public class CleverLily {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        double toyPrice = Double.parseDouble(scanner.nextLine());

        double sum = 0;
        int counter = 0;
        int money = 10;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                sum = sum + money;
                money += 10;
                counter++;
            } else {
                sum = sum + toyPrice;
            }
        }

        sum -= counter;
        double diff = Math.abs(sum - price);
        if (price > sum) {
            System.out.printf("No! %.2f", diff);
        } else {
            System.out.printf("Yes! %.2f", diff);
        }
    }
}
