package com.jayant.service;

import com.jayant.dao.EmployeeDao;
import com.jayant.dto.Employee;
import com.jayant.factories.EmployeeDaoFactory;

public class EmployeeServiceImpl implements EmployeeService {

	
	@Override
	public String addEmployee(Employee employee) {
		EmployeeDao employeeDao =  EmployeeDaoFactory.getEmployeeDao();
		String status = employeeDao.add(employee);
		return status;
	}

	@Override
	public Employee searchEmployee(int sid) {
		EmployeeDao employeeDao = EmployeeDaoFactory.getEmployeeDao();
		Employee employee = employeeDao.search(sid);
		return employee;
	}

	@Override
	public String updateEmployee(Employee employee) {
		EmployeeDao employeeDao = EmployeeDaoFactory.getEmployeeDao();
		String status = employeeDao.update(employee);
		return status;
	}

	@Override
	public String deleteEmployee(int sid) {
		EmployeeDao employeeDao = EmployeeDaoFactory.getEmployeeDao();
		return employeeDao.delete(sid);
	}

}
