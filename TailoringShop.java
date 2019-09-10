package com.company;

import java.util.Scanner;

public class TailoringShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTables = Integer.parseInt(scanner.nextLine());
        double tableLengthM = Double.parseDouble(scanner.nextLine());
        double tableWidthM = Double.parseDouble(scanner.nextLine());

        double tableSumCloth = numTables * ((tableLengthM + 2 * 0.30) * (tableWidthM + 2 * 0.30));
        double tableSumDiamond = numTables * ((tableLengthM/2) * (tableLengthM/2));

        double priceInUsd = tableSumCloth * 7 + tableSumDiamond * 9;
        double priceInBgn = priceInUsd * 1.85;

        System.out.printf("%.2f USD\n%.2f BGN", priceInUsd, priceInBgn);
    }
}