package com.company;

import java.util.Scanner;

public class AlcoholMarket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceWiskey = Double.parseDouble(scanner.nextLine());
        double beerLiters = Double.parseDouble(scanner.nextLine());
        double wineLiters = Double.parseDouble(scanner.nextLine());
        double liqueorLiters = Double.parseDouble(scanner.nextLine());
        double wiskeyLiters = Double.parseDouble(scanner.nextLine());

        double priceLiqueor = priceWiskey * 0.50;
        double priceWine = priceLiqueor - (priceLiqueor * 0.40);
        double priceBeer = priceLiqueor - (priceLiqueor * 0.80);

        double forWiskey = priceWiskey * wiskeyLiters;
        double forBeer = priceBeer * beerLiters;
        double forWine = priceWine * wineLiters;
        double forLiqueor = priceLiqueor * liqueorLiters; 

        double totalCost = forBeer + forLiqueor + forWine + forWiskey;

        System.out.printf("%.2f", totalCost);
    }
}