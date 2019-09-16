package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        switch (num) {
            case 1:
                num = 1;
                System.out.println("Monday");
                break;
            case 2:
                num = 2;
                System.out.println("Tuesday");
                break;
            case 3:
                num = 3;
                System.out.println("Wednesday");
                break;
            case 4:
                num = 4;
                System.out.println("Thursday");
                break;
            case 5:
                num = 5;
                System.out.println("Friday");
                break;
            case 6:
                num = 6;
                System.out.println("Saturday");
                break;
            case 7:
                num = 7;
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error");
        }
    }
}

