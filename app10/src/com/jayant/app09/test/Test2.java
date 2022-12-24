package com.jayant.app09.test;

public class Test2 implements TestInterface {

	@Override
	public Test1 execute() {
		Test1 t = new Test1(1, "Jayant");
		return t;
	}

}
