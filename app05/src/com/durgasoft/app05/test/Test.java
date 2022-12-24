package com.durgasoft.app05.test;

class A{
	static {
		System.out.println("Class Loading...");
	}
	A(){
		System.out.println("Object creating...");
	}
}
public class Test {

	public static void main(String[] args) {

		A a = new A();
		
	}

}
