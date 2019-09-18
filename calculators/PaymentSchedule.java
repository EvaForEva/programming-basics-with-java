package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class PaymentSchedule {

    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {
        int principal = (int) readNumber("Principal: ", 1000, 1_000_000);
        float aInterest = (float) readNumber("Annual Interest Rate: ", 1, 10);
        byte years = (byte) readNumber("Period (Years): ", 1, 30);

        double mortgage = calculateMortgage(principal, aInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("---------");
        System.out.println("Monthly Payments: " + mortgageFormatted);

        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
            double balance = calculateBalance(principal, aInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }

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

    public static double calculateBalance (
            int principal,
            float aInterest,
            byte years,
            short numberOfPaymentsMade) {

        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);
        float mInterest = aInterest / PERCENT / MONTHS_IN_YEAR;

        double balance = principal
                * (Math.pow(1 + mInterest, numberOfPayments) - Math.pow(1 + mInterest, numberOfPaymentsMade))
                / (Math.pow(1 + mInterest, numberOfPayments) - 1);

        return balance;
    }

    public static double calculateMortgage (
            int principal,
            float aInterest,
            byte years) {

        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);
        float mInterest = aInterest / PERCENT / MONTHS_IN_YEAR;

        double mortgage = principal
                * (mInterest * Math.pow(1 + mInterest, numberOfPayments))
                / (Math.pow(1 + mInterest, numberOfPayments) - 1);

        return mortgage;
    }
}
