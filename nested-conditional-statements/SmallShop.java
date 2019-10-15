package com.company;

import java.util.Scanner;

public class SmallShop {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine().toLowerCase();
        String city = scanner.nextLine().toLowerCase();
	    double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0.0;

	    if (city.equals("sofia")) {
	        if (product.equals("coffee")) {
                price = 0.5;
            } else if (product.equals("water")) {
                price = 0.8;
            } else if (product.equals("beer")) {
                price = 1.2;
            } else if (product.equals("sweets")) {
                price = 1.45;
            } else if (product.equals("peanuts")) {
                price = 1.60;
            }
        } else if (city.equals("plovdiv")) {
            if (product.equals("coffee")) {
                price = 0.4;
            } else if (product.equals("water")) {
                price = 0.7;
            } else if (product.equals("beer")) {
                price = 1.15;
            } else if (product.equals("sweets")) {
                price = 1.30;
            } else if (product.equals("peanuts")) {
                price = 1.50;
            }
        } else if (city.equals("varna")) {
            if (product.equals("coffee")) {
                price = 0.45;
            } else if (product.equals("water")) {
                price = 0.7;
            } else if (product.equals("beer")) {
                price = 1.1;
            } else if (product.equals("sweets")) {
                price = 1.35;
            } else if (product.equals("peanuts")) {
                price = 1.55;
            }
        }
	    double result = price* quantity;
        System.out.println(result);
    }
}
