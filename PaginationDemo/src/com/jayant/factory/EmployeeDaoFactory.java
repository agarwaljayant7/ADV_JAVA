package com.jayant.factory;

import com.jayant.dao.EmployeeDao;
import com.jayant.dao.EmployeeDaoImpl;
import com.jayant.dto.Employee;

public class EmployeeDaoFactory {

	private static EmployeeDao employeeDao;
	static {
		employeeDao = new EmployeeDaoImpl();
	}
	
	public static EmployeeDao getEmployeeDao() {
		return employeeDao;
	}
}
