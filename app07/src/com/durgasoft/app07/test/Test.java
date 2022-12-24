package com.durgasoft.app07.test;

import com.durgasoft.app07.entities.A;

public class Test {

	public static void main(String[] args) throws Exception {

//		A a = new A();
		
		Class cls = Class.forName("com.durgasoft.app07.entities.A");
		Object obj = cls.newInstance();
		
	}

}
