package com.durgasoft.app23.threads;

public class RegisterCourse extends Thread {


	Object courseName;
	Object trainerName;
	
	
	public RegisterCourse(Object courseName, 
			Object trainerName){
		this.courseName = courseName;
		this.trainerName = trainerName;
		
	} 
	
	@Override
	public void run() {
		
		synchronized (courseName) {
			System.out.println("RegisterCourse thread"
					+ "holds courseName and waiting"
					+ "for");
		}
		
	}
}
