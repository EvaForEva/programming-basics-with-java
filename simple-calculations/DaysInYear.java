class DaysInYear {
	public static void main(String args[]) {

	int iDay = Integer.parseInt(args[0]);
	int iMonth = Integer.parseInt(args[1]);
	int iYear = Integer.parseInt(args[2]);
	int iDaysInYear = 0;
	
	for(int iM = 1; iM < iMonth; iM++) {
		switch(iM) {
			
			case 4: iDaysInYear += 30;
			break;
			case 6: iDaysInYear += 30;
			break;
			case 9: iDaysInYear += 30;
			break;
			case 11: iDaysInYear += 30;
			break;
        
			case 2: iDaysInYear += 28;
			if((((iYear % 4) == 0) && !((iYear % 100) == 0)) || ((iYear % 400) == 0)) {
				iDaysInYear++;
			}
			break;
		
			default: iDaysInYear += 31;
		}
	}
	iDaysInYear+= iDay;
	
	System.out.println("The " + iDay + "." + iMonth + "." + iYear + " is the " + iDaysInYear + ". day in the year.");
	}
}