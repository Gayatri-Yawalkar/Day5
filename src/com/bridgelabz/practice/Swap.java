package com.bridgelabz.practice;

import com.bridgelabz.utility.Utility;

public class Swap {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter First Number");
		int first=utility.getIntValue();
		System.out.println("Enter Second Number");
		int second=utility.getIntValue();
		utility.swapTwoNumbers(first,second);

	}

}
