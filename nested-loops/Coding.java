package com.company;

import java.util.Scanner;

public class Coding {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    String number = scanner.nextLine();
	    for (int i = number.length() - 1; i >= 0; i--) {
	        int num = Integer.parseInt("" + number.charAt(i));
	        int code = num + 33;
	        if (num == 0) {
                System.out.print("ZERO");
            }
            for (int j = 0; j < num; j++) {
                System.out.print((char) code);
            }
            System.out.println();
        }
    }
}
