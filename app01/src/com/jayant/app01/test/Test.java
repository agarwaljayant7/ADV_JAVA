package com.jayant.app01.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws IOException {
//		System.out.println("Hello worlds");
//		A a = new B();
//		a.m1();
//		a.m2();
//		
//		B b = new B();
//		b.m1();
//		b.m2();
//		b.m3();
//		
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		
		System.out.print("Enter the data: ");

		String data = br.readLine();
		
		System.out.print("Enter the same data again : ");
		int val = br.read();
		
		System.out.println("readLine() : " + data);
//		System.out.println("read() : " + val + " ["
//					+ char(val));
		System.out.println(val);
		
	}

	
}
