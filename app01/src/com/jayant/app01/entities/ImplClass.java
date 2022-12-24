package com.jayant.app01.entities;

public class ImplClass implements I {

	@Override
	public void m1() {
		System.out.println("m1-ImplClass");
	}

	@Override
	public void m2() {
		System.out.println("m2-ImplClass");
	}
	
	public void m3() {
		System.out.println("m3-ImplClass only");
	}

}
