package com.company;

import java.util.Scanner;

public class MetricConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double value = Double.parseDouble(scanner.nextLine());
        String inputMetric = scanner.nextLine();
        String outputMetric = scanner.nextLine();

        if(inputMetric.equals("mm")) {
            value = value / 1000;
        }  
        if(inputMetric.equals("cm")) {
            value = value / 100;
        }
        if(outputMetric.equals("mm")) {
            value = value * 1000;
        } 
        if(outputMetric.equals("cm")) {
            value = value * 100;
        } 
        System.out.printf("%.3f", value);
    }
}