package com.company;

import java.util.Scanner;

public class SumOfTwoNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beginningRange = Integer.parseInt(scanner.nextLine());
        int endRange = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        boolean flag = false;
        int count = 0;
        for (int i = beginningRange; i <= endRange; i++) {
            for (int j = beginningRange; j <= endRange; j++) {
                int sum = i + j;
                count++;
                if (magicNum == sum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", count, i, j, sum);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        if (!flag) {
            System.out.printf("%d combinations - neither equals %d", count, magicNum);
        }
    }
}