package com.jayant.factories;

import com.jayant.service.EmployeeService;
import com.jayant.service.EmployeeServiceImpl;

public class EmployeeServiceFactory {

	private static EmployeeService employeeService = null;
	
	static {
		employeeService = new EmployeeServiceImpl();
	}
	
	public static EmployeeService getEmployeeService() {
		return employeeService;
	}
}
