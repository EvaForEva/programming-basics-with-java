import java.io.*;
import java.util.*;

class ScannerE {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		
		String strInput;
		int iInput = 0;
		boolean blFlag = true;
		
		do {
			blFlag = false;
			try {
				System.out.print("Please enter a number: ");
				iInput = scr.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("That is not a number.");
				blFlag = true;
				scr.nextLine();
			} catch(NoSuchElementException e) {
				blFlag = true;
			} catch(IllegalStateException e) {
				blFlag = true;
			}
			
		} while (blFlag);
		
		System.out.println(iInput);
	}
}