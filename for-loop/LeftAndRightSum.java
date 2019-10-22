package com.company;

import java.util.Scanner;

public class LeftAndRightSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 1; i <= n * 2; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (i <= n) {
                sumLeft = sumLeft + num;
            } else {
                sumRight = sumRight + num;
            }
        }
        int diff = Math.abs(sumLeft - sumRight);
        if (diff == 0) {
            System.out.println("Yes, sum = " + sumLeft);
        } else {
            System.out.println("No, diff = " + diff);
        }
    }
}
