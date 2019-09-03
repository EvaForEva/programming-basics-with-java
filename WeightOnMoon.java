package com.company;

public class WeightOnMoon {

    public static void main(String[] args) {
	    double eweight, mgravity, egravity, mweight;
	    eweight = 68;
	    egravity = 9.81;
	    mgravity = 0.17*egravity;
	    mweight = ((eweight/egravity)*mgravity);

	    System.out.println("My weight on moon is: " +  mweight);
    }
}