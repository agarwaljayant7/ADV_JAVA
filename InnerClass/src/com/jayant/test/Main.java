package com.jayant.test;

class A{
	int i = 10;
	static int k = 30;
	
	void m1() {
		System.out.println("m1-A");
	}
	
	class B{
		int j = 20;
		static int l = 40;
		void m2() {
			System.out.println("m2-B");
		}
	}
}


public class Main {

	public static void main(String[] args) {
		
		A a = new A();
		System.out.println(a.i);
		
		A.B ab = a.new B();
		
		A.B a1 = new A().new B();
		
		System.out.println(A.k);
		System.out.println(a1.l);
		
	}

}
