package com.company;

import java.util.Scanner;
 
public class Graduation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name= scanner.nextLine();
        int num = 1;
        int numNo = 0;
        double avarageNote ==0.0;
        while (num <= 12){
            double goodNote = Double.parseDouble(scanner.nextLine());
            if (goodNote >= 4){
                avarageNote += goodNote;
                numNo = 0;
                num++;
            } else {
                numNo++;
                if (numNo == 2){
                   System.out.printf("%s has been excluded at %d grade", name, br);
                    break;
                }
            }
        }
        if (numNo!=2) {
            avarageNote /= 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, avarageNote);
        }
    }
}