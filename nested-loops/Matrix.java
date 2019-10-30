package com.company;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());

        for (int x1 = a; x1 <= b; x1++) {
            for (int x2 = a; x2 <= b; x2++) {
                for (int x3 = c; x3 <= d; x3++) {
                    for (int x4 = c; x4 <= d; x4++) {
                        if (x1 != x2 && x3 != x4) {
                            if (x1 + x4 == x2 + x3) {
                            System.out.println("" + x1 + x2);
                            System.out.println("" + x3 + x4);
                            System.out.println();
                            }
                        }
                    }
                }
            }
        }
    }
}
