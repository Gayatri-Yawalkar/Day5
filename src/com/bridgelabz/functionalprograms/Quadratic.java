package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.FunctionalUtility;
public class Quadratic {
	public static void main(String[] args) {
		FunctionalUtility futility=new FunctionalUtility();
		System.out.println("Enter value of a");
		int a=futility.getIntValue();
		System.out.println("Enter value of b");
		int b=futility.getIntValue();
		System.out.println("Enter value of c");
		int c=futility.getIntValue();
		futility.getRoots(a,b,c);
	}
}
