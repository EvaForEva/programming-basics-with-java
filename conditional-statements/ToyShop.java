package com.company;

import java.util.Scanner;

public class ToyShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceTrip = Double.parseDouble(scanner.nextLine());
        int puzzel = Integer.parseInt(scanner.nextLine());
        int talkingDoll = Integer.parseInt(scanner.nextLine());
        int teddyBear = Integer.parseInt(scanner.nextLine());
        int minion = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());

        double costPuzzels = puzzel * 2.60;
        double costTalkingDoll = talkingDoll * 3;
        double costTeddyBears = teddyBear * 4.10;
        double costMinon = minion * 8.20;
        double costTruck = truck * 2;

        int totalToys = puzzel + talkingDoll + teddyBear + minion + truck;
        double totalCost = costPuzzels + costTalkingDoll + costTeddyBears + costMinon + costTruck;

        if(totalToys >= 50) {
            totalCost = totalCost - (totalCost * 0.25);
        }

        totalCost = totalCost - (totalCost * 0.10);

        if (totalCost >= priceTrip) {
            System.out.printf("Yes! %.2f lv left.", totalCost - priceTrip);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", priceTrip - totalCost);
        }
    }
}
