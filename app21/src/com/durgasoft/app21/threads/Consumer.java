package com.durgasoft.app21.threads;

import com.durgasoft.app21.entities.A;

public class Consumer extends Thread {

	A a;
	public Consumer(A a ){
		this.a = a;
	}
	
	@Override
	public void run() {
		a.consume();
	}
}
