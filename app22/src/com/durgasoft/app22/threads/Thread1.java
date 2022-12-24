package com.durgasoft.app22.threads;

import com.durgasoft.app22.entities.A;
import com.durgasoft.app22.scopes.ThreadScope;

public class Thread1 extends Thread {

	public static ThreadScope threadScope = new ThreadScope();
	
	A a;
	
	public Thread1(A a){
		this.a = a;
	}
	
	@Override
	public void run() {
		threadScope.set("Hi , this is "
				+ "the data from Thread1 Scope");
		
		a.m1();
		a.m2();
	}
}
