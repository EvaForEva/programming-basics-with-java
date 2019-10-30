package com.company;

import java.util.Scanner;

public class TrainTheTrainers {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int juryCnt = Integer.parseInt(scanner.nextLine());
        String presentation = scanner.nextLine();
        double totalGrades = 0.0;
        int totalGradesCount = 0;

        while (!"Finish".equals(presentation)) {
            double currentGrades = 0.0;
            for (int i = 0; i < juryCnt; i++) {
                totalGradesCount++;
                currentGrades += Double.parseDouble(scanner.nextLine());
            }
            double currentAavarageGrade = currentGrades / juryCnt;
            System.out.printf("%s - %.2f.%n", presentation, currentAavarageGrade);
            totalGrades += currentGrades;
            presentation = scanner.nextLine();
        }
        double avarageGrade = totalGrades / totalGradesCount;
        System.out.printf("Student's final assessment is %.2f.", avarageGrade);
    }
}
