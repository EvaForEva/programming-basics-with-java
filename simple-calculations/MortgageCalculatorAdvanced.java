package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculatorAdvanced {

    public static void main(String[] args) {
        int principal = (int) readNumber("Principal: ", 1000, 1_000_000);
        float aInterest = (float) readNumber("Annual Interest Rate: ", 1, 10);
        byte years = (byte) readNumber("Period (Years): ", 1, 30);
        double mortgage = calculateMortgage(principal, aInterest, years);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if(value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + Math.round(min) + " and " + Math.round(max));
        }
        return value;
    }

    public static double calculateMortgage (
            int principal,
            float aInterest,
            byte years) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);
        float mInterest = aInterest / PERCENT / MONTHS_IN_YEAR;

        double mortgage = principal
                * (mInterest * Math.pow(1 + mInterest, numberOfPayments))
                / (Math.pow(1 + mInterest, numberOfPayments) - 1);
        return mortgage;
    }
}
