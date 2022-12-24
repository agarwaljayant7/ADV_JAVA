package com.durgasoft.app06.threads;

import com.durgasoft.app06.entities.A;

public class Thread1 extends Thread{
	A a;
	public Thread1(A a){
		this.a = a;
	}
	public void run() {
		a.m1();
	}
}
