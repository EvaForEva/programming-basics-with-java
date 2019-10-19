package com.company;

import java.util.Scanner;

public class Coins {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double change = Double.parseDouble(scanner.nextLine());
        String changeString = String.format("%.0f", Math.floor(change * 100));
        int stotinki = Integer.parseInt(changeString);

        int count = 0;

        while (stotinki > 0) {
            if (stotinki >= 200) {
                stotinki = stotinki - 200;
                count++;
            } else if (stotinki >= 100) {
                stotinki = stotinki - 100;
                count++;
            } else if (stotinki >= 50) {
                stotinki = stotinki - 50;
                count++;
            } else if (stotinki >= 20) {
                stotinki = stotinki - 20;
                count++;
            } else if (stotinki >= 10) {
                stotinki = stotinki - 10;
                count++;
            } else if (stotinki >= 5) {
                stotinki = stotinki - 5;
                count++;
            } else if (stotinki >= 2) {
                stotinki = stotinki - 2;
                count++;
            } else if (stotinki >= 1) {
                stotinki = stotinki - 1;
                count++;
            }
        }
        System.out.println(count);
    }

}
