package com.company;

import java.util.Scanner;

public class PetShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberDogs = Integer.parseInt(scanner.nextLine());
        int restAnimals = Integer.parseInt(scanner.nextLine());

        double pricePersonalDogs = 2.50;
        double priceNeighbourDogs = 4;

        double costs = (numberDogs * pricePersonalDogs) + (restAnimals * priceNeighbourDogs);

        System.out.printf("%.2f lv.", costs);
    }
}
