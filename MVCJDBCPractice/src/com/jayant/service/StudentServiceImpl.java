package com.jayant.service;

import com.jayant.dao.StudentDao;
import com.jayant.dao.StudentDaoFactory;
import com.jayant.dto.Student;

public class StudentServiceImpl implements StudentService {

	@Override
	public String addStudent(Student student) {
		StudentDao studentDao = StudentDaoFactory.getStudentDao();
		studentDao.add(student);
		
	}

	@Override
	public Student searchStudent(String sid) {
		StudentDao studentDao = StudentDaoFactory.getStudentDao();
		studentDao.search(sid);
		
	}

	@Override
	public String updateStudent(Student student) {
		StudentDao studentDao = StudentDaoFactory.getStudentDao();
		studentDao.update(student);
	}

	@Override
	public String deleteStudent(String sid) {
		StudentDao studentDao = StudentDaoFactory.getStudentDao();
		studentDao.delete(sid);
	}


}
