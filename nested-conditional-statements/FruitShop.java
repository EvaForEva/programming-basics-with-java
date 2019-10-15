package com.company;

import java.util.Scanner;

public class FruitShop {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    String product = scanner.nextLine();
	    String day = scanner.nextLine().toLowerCase();
	    double quantity = Double.parseDouble(scanner.nextLine());
	    boolean flag = true;
        double price = 0.0;

        if (day.equals("monday") ||
                day.equals("tuesday") ||
                day.equals("wednesday") ||
                day.equals("thursday") ||
                day.equals("friday")) {
            if (product.equals("banana")) {
                price = 2.5;
            } else if (product.equals("apple")) {
                price = 1.2;
            } else if (product.equals("orange")) {
                price = 0.85;
            } else if (product.equals("grapefruit")) {
                price = 1.45;
            } else if (product.equals("kiwi")) {
                price = 2.7;
            } else if (product.equals("pineapple")) {
                price = 5.5;
            } else if (product.equals("grapes")) {
                price = 3.85;
            } else {
                flag = false;
            }
        } else if (day.equals("saturday") || day.equals("sunday")) {
            if (product.equals("banana")) {
                price = 2.7;
            } else if (product.equals("apple")) {
                price = 1.25;
            } else if (product.equals("orange")) {
                price = 0.9;
            } else if (product.equals("grapefruit")) {
                price = 1.6;
            } else if (product.equals("kiwi")) {
                price = 3.0;
            } else if (product.equals("pineapple")) {
                price = 5.6;
            } else if (product.equals("grapes")) {
                price = 4.2;
            } else {
                flag = false;
            }
        } else {
            flag = false;
        }

        if (flag) {
            double result = price * quantity;
            System.out.printf("%.2f", result);
        } else {
            System.out.println("error");
        }
    }
}
