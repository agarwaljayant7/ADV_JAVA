package com.jayant.factory;

import com.jayant.dao.StudentDao;
import com.jayant.dao.StudentDaoImpl;

public class StudentDaoFactory {

	private static StudentDao studentDao;
	static {
		studentDao = new StudentDaoImpl();
	}
	
	public static StudentDao getStudentDao() {
		return studentDao;
	}
}
