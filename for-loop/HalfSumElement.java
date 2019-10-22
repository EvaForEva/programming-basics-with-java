package com.company;

import java.util.Scanner;

public class HalfSumElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int sumAllNums = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sumAllNums = sumAllNums + num;

            if (num > maxNum) {
                maxNum = num;
            }
        }
        int sumWithougMaxNum = sumAllNums - maxNum;
        int diff = Math.abs(maxNum - sumWithougMaxNum);
        if (sumWithougMaxNum == maxNum) {
            System.out.printf("Yes%nSum = %d", maxNum);
        } else {
            System.out.printf("No%nDiff = %d", diff);
        }
    }

}
