package com.jayant.interfacedemo;

public abstract class B extends A{

	@Override
	public void m1() {
		super.m1();
		System.out.println("m1-B");
		
	}
	
	public void m2() {
		System.out.println("m2-B");
	}
	
	
}