package com.company;

import java.util.Scanner;

public class FishingBoat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budgetGroup = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());
        double price = 0.0;
        
        switch (season) {
            case "Spring":
                price = 3000;
                break;
            case "Summer":
                price = 4200;
                break;
            case "Autumn":
                price = 4200;
                break;
            case "Winter":
                price = 2600;
                break;
        }

        if (fishermen <= 6) {
            price = price * 0.9;
        } else if (fishermen <= 11) {
            price = price * 0.85;
        } else if (fishermen >= 12) {
            price = price * 0.75;
        }

        if (fishermen % 2 == 0 && season != "Autumn") {
            price = price * 0.95;
        }

        double difference = 0.0;
        if (budgetGroup >= price) {
            difference = budgetGroup - price;
            System.out.printf("Yes! You have %.2f leva left.", difference);
        } else {
            difference = price - budgetGroup;
            System.out.printf("Not enough money! You need %.2f leva.", difference);
        }
        
    }
}