package com.durgasoft.app06.test;

import com.durgasoft.app06.entities.A;
import com.durgasoft.app06.threads.Thread1;
import com.durgasoft.app06.threads.Thread2;
import com.durgasoft.app06.threads.Thread3;

public class Test {

	public static void main(String[] args) {

		A a = new A();
		Thread1 t1 = new Thread1(a);
		Thread2 t2 = new Thread2(a);
		Thread3 t3 = new Thread3(a);
		
		t1.setName("AAA");
		t2.setName("BBB");
		t3.setName("CCC");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
