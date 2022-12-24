package com.durgasoft.app06.threads;

import com.durgasoft.app06.entities.A;

public class Thread2 extends Thread{
	
	A a;
	public Thread2(A a){
		this.a = a;
	}
	public void run() {
		a.m1();
	}

}
