package com.company;

import java.util.Scanner;

public class AreaCircle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());

        double pi = Math.PI;
        double area = pi * r * r;
        double p = 2 * pi * r;
        System.out.printf("%.2f\n%.2f", area, p);
    }
}
