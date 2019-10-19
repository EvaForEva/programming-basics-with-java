package com.company;

import java.util.Scanner;

public class ExamPreparation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int badGrades = Integer.parseInt(scanner.nextLine());
        int badGradesCount = 0;
        boolean isBad = false;
        double sum = 0;
        int totalGradeCount = 0;
        String lastProblem = "";

        String problem = scanner.nextLine();
        while (!"Enough".equals(problem)) {
            int grade = Integer.parseInt(scanner.nextLine());
            totalGradeCount++;
            sum = sum + grade;
            if (grade <= 4) {
                badGradesCount++;
            }

            if (badGrades == badGradesCount) {
                isBad = true;
                break;
            }
            lastProblem = problem;
            problem = scanner.nextLine();
        }
        if (isBad) {
            System.out.printf("You need a break, %d poor grades.", badGrades);
        } else {
            System.out.printf("Average score: %.2f%nNumber of problems: %d%nLast problem: %s", sum / totalGradeCount, totalGradeCount, lastProblem);
        }
    }

}
