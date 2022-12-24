package com.durgasoft.app21.threads;

import com.durgasoft.app21.entities.A;

public class Producer extends Thread {
	
	A a;
	
	public Producer(A a ) {
		this.a = a;
	}
	
	@Override
	public void run() {
		a.produce();
	}
	
}
