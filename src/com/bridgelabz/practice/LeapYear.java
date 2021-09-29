package com.bridgelabz.practice;

import com.bridgelabz.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter year to check leap year or not");
		int year=utility.getIntValue();
		utility.checkLeapYear(year);
	}

}
