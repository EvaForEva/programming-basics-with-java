package com.company;

import java.util.Scanner;

public class OnTimeForTheExam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int extraHours = Integer.parseInt(scanner.nextLine());
        int extraMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHours = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        int examTimeMinutes = extraHours * 60 + extraMinutes;
        int arrivalTimeMinutes = arrivalHours * 60 + arrivalMinutes;
        int time = examTimeMinutes - arrivalTimeMinutes;

        if (time < 0) {
            System.out.println("Late");
            int hours = Math.abs(time) / 60;
            int mins = Math.abs(time) % 60;
            if (time > -60) {
                System.out.printf("%d minutes after the start", mins);
            } else {
                System.out.printf("%d:%02d hours after the start", hours, mins);
            }
        } else if (time <= 30) {
            System.out.println("On time");
            if (time > 0) {
                System.out.printf("%d minutes before the start", time);
            }
        } else {
            System.out.println("Early");
            int hours = time / 60;
            int mins = time % 60;
            if (time >= 60) {
                System.out.printf("%d:%02d hours before the start", hours, mins);
            } else {
                System.out.printf("%d minutes before the start", mins);
            }
        }
    }

}
