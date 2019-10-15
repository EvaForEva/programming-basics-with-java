package com.company;

import java.util.Scanner;

public class SkiTrip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine().toLowerCase();
        String note = scanner.nextLine();
        double price = 0.0;
        double priceWithDiscount = 0.0;

        if (roomType.equals("president apartment")) {
            price = 35.00 * (days - 1);
            if (days < 10) {
                priceWithDiscount = price - (price * 0.10);
            } else if (days <= 15) {
                priceWithDiscount = price - (price * 0.15);
            } else {
                priceWithDiscount = price - (price * 0.20);
            }
        } else if (roomType.equals("apartment")) {
            price = 25.00 * (days - 1);
            if (days < 10) {
                priceWithDiscount = price - (price * 0.30);
            } else if (days <= 15) {
                priceWithDiscount = price - (price * 0.35);
            } else {
                priceWithDiscount = price - (price * 0.50);
            }
        } else if (roomType.equals("room for one person")) {
            price = 18.00 * (days - 1);
            priceWithDiscount = price;
        }

        double finalSum = 0.0;
        if (note.equals("positive")) {
            finalSum = priceWithDiscount + (priceWithDiscount * 0.25);
        } else {
            finalSum = priceWithDiscount - (priceWithDiscount * 0.1);
        }

        System.out.printf("%.2f", finalSum);
    }
}
