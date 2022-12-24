package com.jayant.controller;

import com.jayant.dto.Student;
import com.jayant.service.StudentService;
import com.jayant.service.StudentServiceFactory;

public class Test {

	public static void main(String[] args) {

		StudentService studentService = StudentServiceFactory.getStudentService();
		studentService.addStudent(new Student(111,"aaa"));
		studentService.searchStudent("S-111");
		studentService.updateStudent("S-111");
		studentService.deleteStudent("S-111");
		
	}

}
