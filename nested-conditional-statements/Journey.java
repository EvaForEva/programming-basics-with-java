package com.company;

import java.util.Scanner;

public class Journey {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        double moneyNeeded = 0.0;
        String location = "";

        switch (season) {
            case "summer":
                if (budget <= 100) {
                    destination = "Bulgaria";
                    moneyNeeded = budget * 0.3;
                    location = "Camp";
                } else if (budget <= 1000) {
                    destination = "Balkans";
                    moneyNeeded = budget * 0.4;
                    location = "Camp";
                } else {
                    destination = "Europe";
                    moneyNeeded = budget * 0.9;
                    location = "Hotel";
                }
                break;
            case "winter":
                if (budget <= 100) {
                    destination = "Bulgaria";
                    moneyNeeded = budget * 0.7;
                    location = "Hotel";
                } else if (budget <= 1000) {
                    destination = "Balkans";
                    moneyNeeded = budget * 0.8;
                    location = "Hotel";
                } else {
                    destination = "Europe";
                    moneyNeeded = budget * 0.9;
                    location = "Hotel";
                }
                break;
        }

        System.out.printf("Somewhere in %s %n", destination);
        System.out.printf("%s - %.2f", location, moneyNeeded);

    }

}
