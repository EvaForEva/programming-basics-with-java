package com.company;

import java.util.Scanner;

public class TradeComission {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double commission = 0.0;
        boolean flag = true;

        if (city.equals("Sofia")) {
            if (sales >= 0 && sales <= 500) {
                commission = 0.05;
            } else if (sales > 500 && sales <= 1000) {
                commission = 0.07;
            } else if (sales > 1000 && sales <= 10000) {
                commission = 0.08;
            } else if (sales > 10000) {
                commission = 0.12;
            } else {
                flag = false;
            }
        } else if (city.equals("Varna")) {
            if (sales >= 0 && sales <= 500) {
                commission = 0.045;
            } else if (sales > 500 && sales <= 1000) {
                commission = 0.075;
            } else if (sales > 1000 && sales <= 10000) {
                commission = 0.1;
            } else if (sales > 10000) {
                commission = 0.13;
            } else {
                flag = false;
            }
        } else if (city.equals("Plovdiv")) {
            if (sales >= 0 && sales <= 500) {
                commission = 0.055;
            } else if (sales > 500 && sales <= 1000) {
                commission = 0.08;
            } else if (sales > 1000 && sales <= 10000) {
                commission = 0.12;
            } else if (sales > 10000) {
                commission =  0.145;
            } else {
                flag = false;
            }
        } else {
            flag = false;
        }

        if (flag) {
            double result = commission * sales;
            System.out.printf("%.2f", result);
        } else {
            System.out.println("error");
        }
    }
}

