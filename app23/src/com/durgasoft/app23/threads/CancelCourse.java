package com.durgasoft.app23.threads;

public class CancelCourse extends Thread {

	Object courseName;
	Object trainerName;
	
	public CancelCourse(Object courseName, Object trainerName) {
		this.courseName = courseName;
		this.trainerName = trainerName;
	}
	
	@Override
	public void run() {
		
	}
	
	
}
