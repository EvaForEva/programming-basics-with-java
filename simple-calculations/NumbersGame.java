/*package com.company;

import java.util.Scanner;

public class NumbersGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = Integer.parseInt(scanner.nextLine());

        if(number%5 == 0)
            System.out.print("Fizz");
        else if(number%3 == 0)
            System.out.print("Buzz");
        else if(number%5 == 0 && number%3 == 0)
            System.out.print("FizzBuzz");
        else
            System.out.print(number);
    }
}*/

package com.company;

import java.util.Scanner;

public class NumbersGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = Integer.parseInt(scanner.nextLine());

        if(number%5 == 0 && number%3 == 0)
            System.out.print("FizzBuzz");
        else if(number%3 == 0)
            System.out.print("Buzz");
        else if(number%5 == 0)
            System.out.print("Fizz");
        else
            System.out.print(number);
    }
}

