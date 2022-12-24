package com.jayant.dao;

import com.jayant.dto.Employee;

public interface EmployeeDao {

	public String add(Employee employee);

	public Employee search(int sid);

	public String update(Employee employee);

	public String delete(int sid);

}
