package com.durgasoft.app06.threads;

import com.durgasoft.app06.entities.A;

public class Thread3 extends Thread{

	A a;
	public Thread3(A a){
		this.a = a;
	}
	public void run() {
		a.m1();
	}
}
