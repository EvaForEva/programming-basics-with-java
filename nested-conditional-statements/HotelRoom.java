package com.company;

import java.util.Scanner;

public class HotelRoom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double priceStudioSingle = 0.0;
        double priceApartmentSingle = 0.0;

        switch (month) {
            case "May": case "October":
                priceStudioSingle = 50;
                priceApartmentSingle = 65;
                break;
            case "June": case "September":
                priceStudioSingle = 75.20;
                priceApartmentSingle = 68.70;
                break;
            case "July": case "August":
                priceStudioSingle = 76;
                priceApartmentSingle = 77;
                break;
        }

        double totalPriceStudio = 0.0;
        if (nights > 7 && nights <= 14 && month.equals("May") || month.equals("October")) {
            totalPriceStudio = (priceStudioSingle * nights) * 0.95;
        } else if (nights > 14 && month.equals("May") || month.equals("October")) {
            totalPriceStudio = (priceStudioSingle * nights) * 0.70;
        } else if (nights > 14 && month.equals("June") || month.equals("September")) {
            totalPriceStudio = (priceStudioSingle * nights) * 0.80;
        } else {
            totalPriceStudio = priceStudioSingle * nights;
        }

        double totalPriceApartment = 0.0;
        if (nights > 14) {
            totalPriceApartment = (priceApartmentSingle * nights) * 0.9;
        } else {
            totalPriceApartment = priceApartmentSingle * nights;
        }

        System.out.printf("Apartment: %.2f lv. %n", totalPriceApartment);
        System.out.printf("Studio: %.2f lv.", totalPriceStudio);
    }

}
