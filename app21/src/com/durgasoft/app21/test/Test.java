package com.durgasoft.app21.test;

import com.durgasoft.app21.entities.A;
import com.durgasoft.app21.threads.Consumer;
import com.durgasoft.app21.threads.Producer;

public class Test {

	public static void main(String[] args) {

		A a = new A();
		
		Producer producer = new Producer(a);
		
		Consumer consumer = new Consumer(a);
		
		producer.start();
		
		consumer.start();
		
		
	}

}
