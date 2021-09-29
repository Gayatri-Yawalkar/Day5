package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.FunctionalUtility;
public class TwoDimensionarray {
	public static void main(String[] args) {
		FunctionalUtility futility=new FunctionalUtility();
		int choice,m,n;
		System.out.println("1.Integer Array");
		System.out.println("2.Double Array");
		System.out.println("3.Boolean Array");
		System.out.println("Enter choice from 1 to 3");
		choice=futility.getIntValue();
		switch(choice) {
			case 1:
				m=futility.getRows();
				n=futility.getCol();
				int[][] intArray=new int[m][n];
				intArray=futility.getIntegerArray(m,n);
				futility.printIntArray(m,n,intArray);
				break;
			case 2:
				m=futility.getRows();
				n=futility.getCol();
				double[][] doubleArray=new double[m][n];
				doubleArray=futility.getDoubleArray(m,n);
				futility.printDoubleArray(m,n,doubleArray);
				break;
			case 3:
				m=futility.getRows();
				n=futility.getCol();
				boolean[][] booleanArray=new boolean[m][n];
				booleanArray=futility.getbooleanArray(m,n);
				futility.printBooleanArray(m,n,booleanArray);
				break;
			default:
				System.out.println("Wrong choice.Enter choice between 1 to 3");
				break;
		}
	}
}
