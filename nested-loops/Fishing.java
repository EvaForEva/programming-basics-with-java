package com.company;

import java.util.Scanner;
 
public class Fishing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quota = Integer.parseInt(scanner.nextLine());
        String nameOfFish = "";
        double total = 0;
        int fishCounter = 0;
 
        while (!nameOfFish.equals("Stop")) {
            nameOfFish = scanner.nextLine();
 
            if (nameOfFish.equals("Stop")) {
 
                if (total >= 0) {
                    System.out.printf("Lyubo's profit from %d fishes is %.2f leva.", fishCounter, total);
                } else {
                    System.out.printf("Lyubo lost %.2f leva today.", Math.abs(total));
                }
                break;
            }
            double kg = Double.parseDouble(scanner.nextLine());
            double currentSum = 0;
 
            for (int i = 0; i < nameOfFish.length(); i++) {
                char letter = nameOfFish.charAt(i);
                currentSum += letter;
            }
            currentSum /= kg;
            fishCounter++;
 
            if (fishCounter % 3 == 0) {
                total += currentSum;
            } else {
                total -= currentSum;
            }
            if (fishCounter == quota) {
                System.out.println("Lyubo fulfilled the quota!");
 
                if (total >= 0) {
                    System.out.printf("Lyubo's profit from %d fishes is %.2f leva.", fishCounter, total);
                } else {
                    System.out.printf("Lyubo lost %.2f leva today.", Math.abs(total));
                }
                break;
            }
        }
    }
}