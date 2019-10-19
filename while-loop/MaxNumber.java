package com.company;

import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int maxNum = Integer.MIN_VALUE; // taking the minimal value of data type integer, it is a constant
        while (n > 0) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number > maxNum) {
                maxNum = number;
            }
            n--;
        }
        System.out.println(maxNum);
    }

}
