package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        int numberOfPayments = 0;
        float aInterest = 0;
        float mInterest = 0;
        byte years = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
            if(principal >= 1_000 && principal <= 1_000_000)
                break;
                System.out.println("Enter a value between 10000 and 1000000.");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            aInterest = scanner.nextFloat();
            if(aInterest >= 1 && aInterest <=10) {
                mInterest = aInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 10.");
        }

        while (true) {
            System.out.print("Period (Years): ");
            years = scanner.nextByte();
            if(years >=1 && years <=30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value greater then 0 and less then or even to 30.");
        }

        double mortgage = principal
                    * (mInterest * Math.pow(1 + mInterest, numberOfPayments))
                    / (Math.pow(1 + mInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
