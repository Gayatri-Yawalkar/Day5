package com.bridgelabz.practice;

import com.bridgelabz.utility.Utility;

public class PowerOfTwo {
	public static void main(String[] args) {
		System.out.println("Enter Number");
		Utility utility=new Utility();
		int number=utility.getIntValue();
		utility.getPowersOfTwo(number);
	}

}
