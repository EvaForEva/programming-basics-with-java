package com.company;

import java.util.Scanner;

public class PersonalTiles {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    double age = Double.parseDouble(scanner.nextLine());
	    String gender = scanner.nextLine();

	    if (gender.equals("m")) {
	        if (age >= 16) {
                System.out.println("Mr.");
            } else {
                System.out.println("Master");
            }
        } else {
	        if (age >= 16) {
                System.out.println("Ms.");
            } else {
                System.out.println("Miss");
            }
        }
    }
}
