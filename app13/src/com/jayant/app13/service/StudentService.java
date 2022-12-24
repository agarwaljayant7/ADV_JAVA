package com.jayant.app13.service;

import com.jayant.app13.dto.Student;

public interface StudentService {

	public String addStudent(Student student);
	public Student searchStudent(String sid);
	public String updateStudent(Student student);
	public String deleteStudent(String sid);
	
}
