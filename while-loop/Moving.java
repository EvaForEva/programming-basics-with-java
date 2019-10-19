package com.company;

import java.util.Scanner;

public class Moving {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int area = width * length * height;
        int sumBoxes = 0;

        while (!command.equals("Done")) {
            int boxesCounter = Integer.parseInt(command);
            sumBoxes = sumBoxes + boxesCounter;
            if (sumBoxes > area) {
                break;
            }
            command = scanner.nextLine();
        }

        int difference = Math.abs(sumBoxes - area);
        if (sumBoxes <= area) {
            System.out.printf("%d Cubic meters left.", difference);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", difference);
        }
    }

}
