package com.company;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floors = Integer.parseInt(scanner.nextLine());
        int roomsOnFloor = Integer.parseInt(scanner.nextLine());

        for (int f = floors; f >= 1; f--) {
            for (int r = 0; r < roomsOnFloor; r++) {
                if (f == floors) {
                    System.out.printf("L%d%d ", f, r);
                } else if (f % 2 == 0) {
                    System.out.printf("O%d%d ", f, r);
                } else {
                    System.out.printf("A%d%d ", f, r);
                }
            }
            System.out.println();
        }
    }
}