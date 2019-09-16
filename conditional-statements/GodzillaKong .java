package com.company;

import java.util.Scanner;

public class GodzillaKong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double costClothesSignle = Double.parseDouble(scanner.nextLine());
        
        double costDeco = budget * 0.10;
        double costClothesTotal = costClothesSignle * statists;

        if (statists > 150) {
            costClothesTotal = costClothesTotal - (costClothesTotal * 0.10);
        }

        double totalCosts = costDeco + costClothesTotal;
        
        if (totalCosts > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalCosts - budget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - totalCosts);
        }

    }
}