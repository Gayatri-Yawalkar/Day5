package com.bridgelabz.utility;

import java.util.Scanner;
public class Utility {
	Scanner scanner;
	public Utility() {
		scanner=new Scanner(System.in);
	}
	public int getIntValue() {
		return scanner.nextInt();
	}	
//HARMONIC NUMBER	
	public void getHarmonicNumber(int number) {
		double harmonicNumber=0;
		for(double i=1;i<=number;i++) {
			harmonicNumber=harmonicNumber+(1/i);
		}
		System.out.println("Harmonic Number of "+number+" is "+harmonicNumber);
	}
//Head Tail Percentage
	public void getHeadTailPercentage(int coin) {
		double head=0,tail=0,possibility;
		for(int i=1;i<=coin;i++) 
		{
			possibility=Math.random();
			System.out.println(possibility);
			if(possibility>0.5) {
				head+=1;
			} else {
				tail+=1;
			}
		}
		double headPer=(head*100/coin);
		System.out.println("Head Percentage="+headPer);
		double tailPer=(100-headPer);
		System.out.println("Tail Percentage="+tailPer);
		
	}
//Leap Year
	public void checkLeapYear(int year) {
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println("Year is Leap Year");
		} else {
			System.out.println("Year is not Leap Year");
		}
	}	
//Power of Two	
	public void getPowersOfTwo(int number) {
		if(number>=0 && number<31) {
			System.out.println(Math.pow(2,number));
		}
	}
//Quotient and Remainder
	public void findQuoRem(int dividend, int divisor) {
		int quo,rem;
		quo=dividend/divisor;
		rem=dividend%divisor;
		System.out.println("Quotient="+quo);
		System.out.println("Remainder="+rem);		
	}
//swap Two Numbers
	public void swapTwoNumbers(int first, int second) {
		int temp;
		temp=first;
		first=second;
		second=temp;
		System.out.println("After Swapping");
		System.out.println("First Number="+first);
		System.out.println("Second Number="+second);
		
	}
//Even or Odd
	public void checkEvenOdd(int number) {
		if(number%2==0) {
			System.out.println(number+" is Even");
		} else {
			System.out.println(number+" is Odd");
		}
	}
}
