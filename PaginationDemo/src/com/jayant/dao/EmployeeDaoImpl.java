package com.jayant.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jayant.dto.Employee;
import com.jayant.factory.ConnectionFactory;

public class EmployeeDaoImpl implements EmployeeDao {

	ResultSet resultSet;
	private static boolean employeeStatus = true;

	public EmployeeDaoImpl() {
		try {
			Connection connection = ConnectionFactory.getConnection();
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			resultSet = statement.executeQuery("SELECT * FROM EMP1");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Employee getEmployee(String label) {
		Employee employee = null;

		try {
			if (label.equalsIgnoreCase("FIRST")) {
				employeeStatus = resultSet.first();
			}
			if (label.equalsIgnoreCase("NEXT")) {
				employeeStatus = resultSet.next();
			}
			if (label.equalsIgnoreCase("PREVIOUS")) {
				employeeStatus = resultSet.previous();
			}
			if (label.equalsIgnoreCase("LAST")) {
				employeeStatus = resultSet.last();
			}
			if (employeeStatus == true) {
				employee = new Employee();
				employee.setEno(resultSet.getInt("ENO"));
				employee.setEname(resultSet.getString("ENAME"));
				employee.setEsal(resultSet.getFloat("ESAL"));
				employee.setEaddr(resultSet.getString("EADDR"));
			}else {
				employee = null;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee;
	}

//	@Override
//	public boolean getEmployeeStatus() {
//		return employeeStatus;
//	}

}
