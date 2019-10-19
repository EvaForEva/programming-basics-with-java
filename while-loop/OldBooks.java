package com.company;

import java.util.Scanner;

public class OldBooks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();
        int libCapacity = Integer.parseInt(scanner.nextLine());

        String currentBook = "";
        int count = 0;
        boolean isFound = false;

        while (!isFound && libCapacity > count) {
            currentBook = scanner.nextLine();
            if (currentBook.equals(bookName)) {
                isFound = true;
            } else {
                count++;
            }
        }
        if (isFound) {
            System.out.printf("You checked %d books and found it.", count);
        } else {
            System.out.printf("The book you search is not here!%nYou checked %d books.", count);
        }

    }

}
