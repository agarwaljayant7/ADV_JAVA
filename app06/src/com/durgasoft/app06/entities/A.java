package com.durgasoft.app06.entities;

public class A {

	public  void m1() {
		System.out.println("Inside m1() method before synch block" +
				Thread.currentThread().getName());
		
		synchronized (this) {
			
		
		int count = 0;
		for(int i =0; i < 10; i++) {
			count = count + 1;
			System.out.println("Inside m1() method, Insided synchrinized block  :  "
			+ Thread.currentThread().getName() + count);
			
		}
		
		}
		
		System.out.println("Outside synch block" +  Thread.currentThread().getName());
	}
	
}
