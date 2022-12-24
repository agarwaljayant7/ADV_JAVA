package com.jayant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jayant.dto.Employee;
import com.jayant.factories.ConnectionFactory;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public String add(Employee employee) {

		String status = "";
		try {
			Connection connection = ConnectionFactory.getConnection();
				Statement statement = connection.createStatement();
			int rowCount = statement.executeUpdate(
					"INSERT INTO EMPLOYEE VALUES(" + employee.getEmployeeNumber() + ", '" + employee.getEmployeeName()
							+ "', " + employee.getEmployeeSalary() + ", '" + employee.getEmployeeAddress() + "')");

			if (rowCount == 1) {
				status = "success";
			} else {
				status = "failure";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public Employee search(int sid) {
		Employee employee = null;
		try {
			Connection connection = ConnectionFactory.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM EMPLOYEE WHERE ENO=" +sid);
			employee = new Employee();
			while(resultSet.next()) {
				employee.setEmployeeNumber(resultSet.getInt("ENO"));
				employee.setEmployeeName(resultSet.getString("ENAME"));
				employee.setEmployeeSalary(resultSet.getFloat("ESAL"));
				employee.setEmployeeAddress(resultSet.getString("EADDR"));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public String update(Employee employee) {
		String status = "";
		try {
			Connection connection = ConnectionFactory.getConnection();
			Statement statement = connection.createStatement();
			// UPDATE EMPLOYEE SET ENAME = 'DAVID', ESAL=10000.1 , EADDR = 'MOON' WHERE ENO=5;
			int rowCount = statement.executeUpdate("UPDATE EMPLOYEE SET ENAME ='" + employee.getEmployeeName() + "', ESAL=" + employee.getEmployeeSalary() + ", EADDR='" + employee.getEmployeeAddress() +"' WHERE ENO=" +employee.getEmployeeNumber());
			
			status = (rowCount == 1) ? "success" : "failure";
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public String delete(int sid) {
		String status = "";
		try {
			Connection connection = ConnectionFactory.getConnection();
			Statement statement = connection.createStatement();
			int rowCount = statement.executeUpdate("DELETE FROM EMPLOYEE WHERE ENO = "+ sid);
						status = rowCount==1 ? "success" : "failure";
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
