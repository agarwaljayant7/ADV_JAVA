package com.jayant.dao;

public class StudentDaoFactory {
	
	private static StudentDao studentDao = null;
	
	static {
		studentDao = new StudentDaoImpl();
	}
	
	public static StudentDao getStudentDao() {
		return studentDao;
	}
}
