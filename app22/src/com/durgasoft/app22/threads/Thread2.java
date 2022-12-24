package com.durgasoft.app22.threads;

import com.durgasoft.app22.entities.A;
import com.durgasoft.app22.scopes.ThreadScope;

public class Thread2 extends Thread {

	public static ThreadScope threadScope
							= new ThreadScope();
	A a;
	
	public Thread2(A a){
		this.a = a;
	}
	
	@Override
	public void run() {
		threadScope.set("Hi m2() method, "
				+ "This is the data from Thread2 scope");
//		a.m2();
		
	}
}
