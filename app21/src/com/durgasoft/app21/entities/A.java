package com.durgasoft.app21.entities;

public class A {
	
	boolean flag = true;
	int itemCount = 0;
	
	public synchronized void produce() {
		try {
			while(true) {
				if(flag == true) {
					itemCount = itemCount + 1;
					System.out.println("Producer "
							+ "produced Item - " + itemCount);
					flag = false;
					notify();
					wait();
				}
				else {
					wait();
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public synchronized void consume() {
		
		try {
			while(true) {
				if(flag == false) {
					System.out.println("Consumer consumed Item - " + itemCount);
					flag = true;
					notify();
					wait();
				}
				else {
					wait();
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
