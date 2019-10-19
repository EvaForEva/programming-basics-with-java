package com.company;

import java.util.Scanner;

public class Vacation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyForTrip = Double.parseDouble(scanner.nextLine());
        double moneyWeHave = Double.parseDouble(scanner.nextLine());

        int spendCount = 0;
        int days = 0;
        boolean moneySaved = true;
        while (moneyWeHave < moneyForTrip) {
            days++;
            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());

            switch (command) {
                case "save":
                    moneyWeHave = moneyWeHave + money;
                    spendCount = 0;
                    break;
                case "spend":
                    spendCount++;
                    moneyWeHave = moneyWeHave - money;
                    if (moneyWeHave < 0) {
                        moneyWeHave = 0;
                    }
                    break;
            }
            if (spendCount == 5) {
                moneySaved = false;
                break;
            }
        }
        if (moneySaved) {
            System.out.printf("You saved the money for %d days.", days);
        } else {
            System.out.printf("You can't save the money.\n%d\n", days);
        }
    }

}
