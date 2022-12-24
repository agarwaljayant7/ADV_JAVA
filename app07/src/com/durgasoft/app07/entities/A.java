package com.durgasoft.app07.entities;

public class A {
	
	static {
		System.out.println("Class loading...");
	}
	
	private int A() {
		System.out.println("Object creating...");
		return 10;
	}
	
	static int i = new A();
}
