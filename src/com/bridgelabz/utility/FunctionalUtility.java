package com.bridgelabz.utility;

import java.io.PrintWriter;
import java.util.Scanner;
public class FunctionalUtility {
	Scanner scanner;
	PrintWriter pw;
	public FunctionalUtility() {
		scanner=new Scanner(System.in);
		pw=new PrintWriter(System.out);
	}
	public int getIntValue() {
		return scanner.nextInt();
	}
	public int[][] getIntegerArray(int row,int col) {
		int[][] array=new int[row][col];
		System.out.println("Enter "+row*col+" integer elements of Array");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				array[i][j]=getIntValue();
			}
		}
		return array;
	}
	public double[][] getDoubleArray(int row, int col) {
		double[][] array=new double[row][col];
		System.out.println("Enter "+row*col+" integer elements of Array");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				array[i][j]=scanner.nextDouble();
			}
		}
		return array;
	}
	public boolean[][] getbooleanArray(int row, int col) {
		boolean[][] array=new boolean[row][col];
		System.out.println("Enter "+row*col+" integer elements of Array");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				array[i][j]=scanner.nextBoolean();
			}
		}
		return array;
	}
	public int getRows() {
		System.out.println("Enter number of rows");
		return getIntValue();
	}
	public int getCol() {
		System.out.println("Enter number of Columns");
		return getIntValue();
	}
	public void printIntArray(int row,int col,int[][] arr) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
			pw.print(arr[i][j]);
			}
		}
	}
	public void printDoubleArray(int row, int col, double[][] arr) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
			pw.print(arr[i][j]);
			}
		}
	}
	public void printBooleanArray(int row, int col, boolean[][] arr) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
			pw.print(arr[i][j]);
			}
		}
	}
//Distance
	public double getDistance(int x, int y) {
		double dis=Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		return dis;
	}
//Quadratic
	public void getRoots(int a, int b, int c) {
		double delta=(Math.pow(b, 2))-(4*a*c);
		double root1=(-b+Math.sqrt(delta))/(2*a);
		double root2=(-b-Math.sqrt(delta))/(2*a);
		System.out.println("Root 1="+root1);
		System.out.println("Root 2="+root2);
	}
}