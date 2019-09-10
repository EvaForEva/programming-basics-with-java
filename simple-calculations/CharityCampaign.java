package com.company;

import java.util.Scanner;

public class CharityCampaign {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int campaignDays = Integer.parseInt(scanner.nextLine());
        int numberChefs = Integer.parseInt(scanner.nextLine());
        int numberCakes = Integer.parseInt(scanner.nextLine());
        int numberWaffels = Integer.parseInt(scanner.nextLine());
        int numberPancakes = Integer.parseInt(scanner.nextLine());

        double costCakes = numberCakes * 45;
        double costWaffels = numberWaffels * 5.80;
        double costPancakes = numberPancakes * 3.20;
        double costAllChefs = numberChefs * (costCakes + costPancakes + costWaffels);
        double costAllDays = costAllChefs * campaignDays;
        double totalCosts = costAllDays - (costAllDays/8);

        System.out.printf("%.2f", totalCosts);
    }
}