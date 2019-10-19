package com.company;
 
import java.util.Scanner;
 
public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int cakePieces = width * length;
        int total = 0;
        while (cakePieces > total){
            String pieces = scanner.nextLine();
            if ("STOP".equals(pieces)){
                break;
            }
            int piecesSecond = Integer.parseInt(pieces);
            total = total + piecesSecond;
        }
        if (cakePieces >= total) {
            System.out.printf("%d pieces are left.", cakePieces - total);
        }
        else if (cakePieces < total){
            System.out.printf("No more cake left! You need %d pieces more.", total - cakePieces);
        }
    }
}