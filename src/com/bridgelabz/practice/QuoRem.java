package com.bridgelabz.practice;

import com.bridgelabz.utility.Utility;

public class QuoRem {
	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter Dividend");
		int dividend=utility.getIntValue();
		System.out.println("Enter Divisor");
		int divisor=utility.getIntValue();
		utility.findQuoRem(dividend,divisor);
	}

}
