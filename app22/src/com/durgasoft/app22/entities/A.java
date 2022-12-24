package com.durgasoft.app22.entities;

import com.durgasoft.app22.threads.Thread1;
import com.durgasoft.app22.threads.Thread2;

public class A {

	public void m1() {
//		System.out.println("m1() :AAA "
//				+ " Thread Scope Data : "
//				+ Thread1.threadScope.get());
//		
//		System.out.println("m1() :BBB "
//				+ " Thread Scope Data : "
//				+ Thread2.threadScope.get());
	}
	
	public void m2() {
		System.out.println("" +
				Thread.currentThread().getName()
				+ " Thread Scope Data : "
				+ Thread2.threadScope.get());
		
		System.out.println("" +
				Thread.currentThread().getName()
				+ " Thread Scope Data : "
				+ Thread1.threadScope.get());
	}
	
}
