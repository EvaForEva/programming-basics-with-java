package com.company;

import java.util.Scanner;

public class Scholarship {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    double income = Double.parseDouble(scanner.nextLine());
        double avarageNote = Double.parseDouble(scanner.nextLine());
        double minWage = Double.parseDouble(scanner.nextLine());

        double socialScolarship = Math.floor(minWage * 0.35);
        double maxScholarship = Math.floor(avarageNote * 25);

        if (income < minWage && avarageNote > 5.50) {
            if (maxScholarship > socialScolarship) {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", maxScholarship);
            } else {
                System.out.printf("You get a Social scholarship %.0f BGN", socialScolarship);
            }
        } else if (income < minWage && avarageNote > 4.50) {
            System.out.printf("You get a Social scholarship %.0f BGN", socialScolarship);
        } else if (avarageNote >= 5.50) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", maxScholarship);
        } else {
            System.out.printf("You cannot get a scholarship!");
        }
    }
}

