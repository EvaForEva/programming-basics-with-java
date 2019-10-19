package com.company;

import java.util.Scanner;

public class AccountBalance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberTransactions = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        while (numberTransactions > 0) {
            double amount = Double.parseDouble(scanner.nextLine());
            if (amount < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            sum = sum + amount;
            System.out.printf("Increase: %.2f %n", amount);
            numberTransactions--;
        }
        System.out.printf("Total: %.2f", sum);
    }

}
