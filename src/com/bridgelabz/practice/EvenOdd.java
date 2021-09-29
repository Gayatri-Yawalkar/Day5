package com.bridgelabz.practice;

import com.bridgelabz.utility.Utility;

public class EvenOdd {
	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter Number to check even or odd");
		int number=utility.getIntValue();
		utility.checkEvenOdd(number);
	}

}
