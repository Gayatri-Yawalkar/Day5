package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.FunctionalUtility;
public class Distance {
	public static void main(String[] args) {
	FunctionalUtility futility=new FunctionalUtility();
	System.out.println("Enter x coordinate value");
	int x=futility.getIntValue();
	System.out.println("Enter y coordinate value");
	int y=futility.getIntValue();
	double distance=futility.getDistance(x,y);
	System.out.println("Distance from ("+x+","+y+") to origin (0,0) is "+distance);
	}
}
