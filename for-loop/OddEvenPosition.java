package com.company;

import java.util.Scanner;

public class OddEvenPosition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double oddSum = 0;
        double evenSum = 0;
        double maxOddNumber = -1000000000.0;
        double minOddNumber = 1000000000.0;
        double maxEvenNumber = -1000000000.0;
        double minEvenNumber = 1000000000.0;

        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0) {
                evenSum = evenSum + num;
                if (num > maxEvenNumber) {
                    maxEvenNumber = num;
                }
                if (num < minEvenNumber) {
                    minEvenNumber = num;
                }
            } else {
                oddSum = oddSum + num;
                if (num > maxOddNumber) {
                    maxOddNumber = num;
                }
                if (num < minOddNumber) {
                    minOddNumber = num;
                }
            }
        }
        System.out.printf("OddSum=%.2f,%n", oddSum);
        if (minOddNumber == 1000000000.0) {
            System.out.printf("OddMin=No,%n");
        } else {
            System.out.printf("OddMin=%.2f,%n", minOddNumber);
        }

        if (maxOddNumber == -1000000000.0) {
            System.out.printf("OddMax=No,%n");
        } else {
            System.out.printf("OddMax=%.2f,%n", maxOddNumber);
        }

        System.out.printf("EvenSum=%.2f,%n", evenSum);
        if (minEvenNumber == 1000000000.0) {
            System.out.printf("EvenMin=No,%n");
        } else {
            System.out.printf("EvenMin=%.2f,%n", minEvenNumber);
        }

        if (maxEvenNumber == -1000000000.0) {
            System.out.printf("EvenMax=No%n");
        } else {
            System.out.printf("EvenMax=%.2f%n", maxEvenNumber);
        }
    }

}
