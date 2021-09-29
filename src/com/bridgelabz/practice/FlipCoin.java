package com.bridgelabz.practice;

import com.bridgelabz.utility.Utility;

public class FlipCoin {
	public static void main(String[] args){
		Utility utility=new Utility();
		System.out.println("Enter number of times coin to be toss:");
		int coin=utility.getIntValue();
		utility.getHeadTailPercentage(coin);
	}

}
