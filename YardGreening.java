package com.company;

import java.util.Scanner;

public class YardGreening {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double squareMeters = Double.parseDouble(scanner.nextLine());
        double priceSingleSqm = 7.61;
        double priceTotal = squareMeters * priceSingleSqm;
        double discount = priceTotal * 0.18;
        double finalPrise = priceTotal - discount;

        System.out.printf("The final price is: %.2f lv.\nThe discount is: %.2f lv.", finalPrise, discount);
    }
}
