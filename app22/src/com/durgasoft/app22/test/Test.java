package com.durgasoft.app22.test;

import com.durgasoft.app22.entities.A;
import com.durgasoft.app22.threads.Thread1;
import com.durgasoft.app22.threads.Thread2;

public class Test {

	
	public static void main(String[] args) {
		
		A a = new A();
		
		Thread1 t1 = new Thread1(a);
		Thread2 t2 = new Thread2(a);
		
		t1.setName("AAA");
		t2.setName("BBB");
		
		t1.start();
		t2.start();

	}

}
