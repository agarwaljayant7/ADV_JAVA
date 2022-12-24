package com.jayant.array.two_dim.test;

public class Main {

	public static void main(String[] args) {
//		int[][] intArray = {{1,2,3},{2,3,4},{3,4,5},{4,5,6}};
		int[][] intArray = new int[4][3];
		intArray[0][0] = 1;
		intArray[0][1] = 2;
		intArray[0][2] = 3;
		
		intArray[1][0] = 2;
		intArray[1][1] = 3;
		intArray[1][2] = 4;
		
		intArray[2][0] = 3;
		intArray[2][1] = 4;
		intArray[2][2] = 5;
		
		intArray[3][0]= 4;
		intArray[3][1] = 5;
		intArray[3][2] = 6;
		
				
				
		System.out.println(intArray); // [[I@abc123
		System.out.println(intArray.length); // 4
		System.out.println(intArray[0]); //[I@xyz123
		System.out.println(intArray[1].length); // 3
		System.out.println();
		System.out.println(intArray[0][1]); // 2
		System.out.println(intArray[1][2]); // 4
		System.out.println(intArray[2][2]); //5 
//		System.out.println(intArray[3][3]); // AIOOBE
//		System.out.println(intArray[4][0]); // AIOOBE
		
		for(int i = 0; i < intArray.length; i++) {
			for(int j = 0; j < intArray[i].length; j++) {
				System.out.print(intArray[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
//		System.out.println(intArray);
		for(int[] singleArray : intArray) {
			
			for(int val : singleArray) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
		
	}

}
