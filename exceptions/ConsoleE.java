import java.io.*;


class ConsoleE {
	public static void main(String args[]) {
		Console con = System.console();
		
		String strInput;
		int iInput = 0;
		boolean blFlag = true;
		
		do {
			blFlag = false;
			try {
				System.out.print("Please enter a number: ");
				strInput = con.readLine();
				iInput = Integer.parseInt(strInput);
			} catch(IOError e) {
				System.out.println("IOError: " + e);
				
			} catch(NumberFormatException e) {
				System.out.println("That was not a number. Please enter a number:");
				blFlag = true;
			}
			
		} while (blFlag);
		
		System.out.println(iInput);
	}
}