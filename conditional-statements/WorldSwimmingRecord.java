package com.company;

import java.util.Scanner;

public class WorldSwimmingRecord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeOneMeter = Double.parseDouble(scanner.nextLine());
        
        double initiallTime = distance * timeOneMeter;
        double delay = Math.floor(distance / 15) * 12.5;
        double totalTime = initiallTime + delay;

        if (record > totalTime) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",  Math.abs(record - totalTime));
        }
    }
}