package com.company;

import java.util.Scanner;

public class NewHouse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeFlowers = scanner.nextLine();
        int numFlowers = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        double totalPrice = 0.0;

        double priceRoses = 5.00;
        double priceDahlias = 3.80;
        double priceTulips = 2.80;
        double priceNarcissus = 3.00;
        double priceGladiolus = 2.50;

        switch (typeFlowers) {
            case "Roses":
                if (numFlowers > 80) {
                    totalPrice = (numFlowers * priceRoses) * 0.9;
                } else {
                    totalPrice = numFlowers * priceRoses;
                }
                break;
            case "Dahlias":
                if (numFlowers > 90) {
                    totalPrice = (numFlowers * priceDahlias) * 0.85;
                } else {
                    totalPrice = numFlowers * priceDahlias;
                }
                break;
            case "Tulips":
                if (numFlowers > 80) {
                    totalPrice = (numFlowers * priceTulips) * 0.85;
                } else {
                    totalPrice = numFlowers * priceTulips;
                }
                break;
            case "Narcissus":
                if (numFlowers < 120) {
                    totalPrice = (numFlowers * priceNarcissus) * 1.15;
                } else {
                    totalPrice = numFlowers * priceNarcissus;
                }
                break;
            case "Gladiolus":
                if (numFlowers < 80) {
                    totalPrice = (numFlowers * priceGladiolus) * 1.2;
                } else {
                    totalPrice = numFlowers * priceGladiolus;
                }
                break;
        }

        double difference = 0;

        if (budget >= totalPrice) {
            difference = budget - totalPrice;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numFlowers, typeFlowers, difference);
        } else {
            difference = totalPrice - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", difference);
        }

    }

}
