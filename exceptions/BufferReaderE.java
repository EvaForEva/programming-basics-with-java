import java.io.*;


class BufferReaderE {
	public static void main(String args[]) {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String strInput;
		int iInput = 0;
		boolean blFlag = true;
		
		do {
			blFlag = false;h
			try {
				System.out.print("Please enter a number: ");
				strInput = br.readLine();
				iInput = Integer.parseInt(strInput);
			} catch(IOException e) {
				System.out.println("IOException: " + e);
				
			} catch(NumberFormatException e) {
				System.out.println("That was not a number. Please enter a number: ");
				blFlag = true;
			}
			
		} while (blFlag);
		
		System.out.println(iInput);
	}
}