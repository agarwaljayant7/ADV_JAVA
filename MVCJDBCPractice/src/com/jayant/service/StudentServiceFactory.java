package com.jayant.service;

public class StudentServiceFactory {

	private static StudentService studentService = null;
	
	static {
		studentService = new StudentServiceImpl();
	}
	public static StudentService getStudentService() {
		return studentService;
	}
}
