package com.jayant.test;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class DeclarationAndInitialization {

	public static void main(String[] args) {
		int[] intArray = {10, 20, 30, 40, 50, 60};// declaration and initialization
		
		System.out.println(intArray); //[I@]
//		System.out.println(intArray.length);
//		System.out.println(intArray[4]);
//		System.out.println(intArray[6]);
//		System.out.println(intArray[intArray.length-2]);
//		System.out.println(intArray[intArray.length-4]);
		System.out.println();
		
//		for(int index = 0; index < intArray.length; index++) {
//			System.out.println(intArray[index]);
//		}
		for(int val : intArray) {
			System.out.println(val);
		}
	}

}
