package com.company;

import java.util.Scanner;
 
public class EqualSumLeftRightPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
 
        for (int i = 1; i <= 9; i++) {
            
            for (int j = 0; j <= 9; j++) {
                
                for (int k = 0; k <= 9; k++) {
                    
                    for (int l = 0; l <= 9; l++) {
                        
                        for (int m = 0; m <= 9; m++) {
                            int c = i * 10000 + j * 1000 + k *100 + l * 10 + m;
                            
                            if (c >= a && c <= b) {
                                
                                if (i + j == m + l) {
                                    System.out.printf("%d ", c);
                                } else if (i + j == k + l + m) {
                                    System.out.printf("%d ", c);
                                } else if (i + j + k == l + m) {
                                    System.out.printf("%d ", c);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}