package com.jayant.test;

public class DeclarationAndThenInitialization {

	public static void main(String[] args) {
		
		int[] intArray = new int[6];
		
		intArray[0]= 10;
		intArray[1] = 20;
		intArray[2] = 30;
		intArray[3] = 40;
		intArray[4] = 50;
		intArray[5] = 60;
		
		System.out.println(intArray);
		for(int val : intArray) {
			System.out.println(val);
		}
	}

}
