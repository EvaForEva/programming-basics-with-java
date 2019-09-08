package com.company;

import java.util.Scanner;

public class FishTank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volumeTank = length * width * height;
        double liters = volumeTank * 0.001;
        double totalLiters = liters * (1 - (percent*0.01));

        System.out.printf("%.3f", totalLiters);
    }
}
