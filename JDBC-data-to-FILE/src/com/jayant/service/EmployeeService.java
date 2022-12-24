package com.jayant.service;

import com.jayant.dto.Employee;

public interface EmployeeService {
	
	public String addEmployee(Employee employee);

	public Employee searchEmployee(int sid);

	public String updateEmployee(Employee employee);

	public String deleteEmployee(int sid);
	
}
