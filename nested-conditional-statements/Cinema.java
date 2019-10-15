package com.company;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeMovie = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        double singlePrice = 0.0;
        double allSeats = r * c;

        if (typeMovie.equals("Premiere")) {
            singlePrice = 12.00;
        } else if (typeMovie.equals("Normal")) {
            singlePrice = 7.50;
        } else if (typeMovie.equals("Discount")) {
            singlePrice = 5.00;
        }

        double totalPrice = singlePrice * allSeats;
        System.out.printf("%.2f", totalPrice);

    }

}
