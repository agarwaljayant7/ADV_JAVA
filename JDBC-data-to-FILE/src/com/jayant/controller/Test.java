package com.jayant.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.jayant.dto.Employee;
import com.jayant.factories.ConnectionFactory;
import com.jayant.factories.EmployeeServiceFactory;
import com.jayant.service.EmployeeService;

public class Test {
	
	static {
		try {
			Class.forName("com.jayant.factories.ConnectionFactory");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		BufferedReader bufferedReader = null;
		EmployeeService employeeService = EmployeeServiceFactory.getEmployeeService();
		int employeeNumber = 0;
		String employeeName ="";
		float employeeSalary =0.0f;
		String employeeAddress = "";
		Employee employee = null;
		
		System.out.println("Employee management system");
		System.out.println("----------------------------");

		try {
			bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				System.out.println();
				System.out.println("1. ADD Employee");
				System.out.println("2. SEARCH Employee");
				System.out.println("3. UPDATE Employee");
				System.out.println("4. DELETE Employee");
				System.out.println("5. EXIT");
				System.out.print("Your Option [1,2,3,4,5]  : ");
				bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				int userChoice = Integer.parseInt(bufferedReader.readLine());

				switch (userChoice) {
				case 1:// ADD Employee
					System.out.print("Employee number         : ");
					employeeNumber = Integer.parseInt(bufferedReader.readLine());

					System.out.print("Employee Name       : ");
					employeeName = bufferedReader.readLine();

					System.out.print("Employee Salary     : ");
					employeeSalary = Float.parseFloat(bufferedReader.readLine());

					System.out.print("Employee Address    : ");
					employeeAddress = bufferedReader.readLine();

					Employee employee1 = new Employee();
					employee1.setEmployeeNumber(employeeNumber);
					employee1.setEmployeeName(employeeName);
					employee1.setEmployeeSalary(employeeSalary);
					employee1.setEmployeeAddress(employeeAddress);
					
					String status = employeeService.addEmployee(employee1);
					if(status.equalsIgnoreCase("success")) {
						System.out.println("Employee Added successfully");
					}else {
						System.out.println("Employee addition failed");
					}
					break;
					
				case 2:// SEARCH Employee
					System.out.print("Employee number          : ");
					employeeNumber = Integer.parseInt(bufferedReader.readLine()); 
					employee = employeeService.searchEmployee(employeeNumber);
					System.out.println("Employee details");
					System.out.println("Emp-Number  Employee-Name  Employee-Salary Employee-Address");
					System.out.println(employee.getEmployeeNumber() + " " + employee.getEmployeeName() + employee.getEmployeeSalary() + employee.getEmployeeAddress());
//					employee = null;
					break;
				case 3: // Update
					System.out.print("Employee Number       : ");
					employeeNumber = Integer.parseInt(bufferedReader.readLine());
					employee = employeeService.searchEmployee(employeeNumber);
					System.out.print("Employee Existing Name       : " + employee.getEmployeeName() + " Employee New Name : ");
					employeeName = bufferedReader.readLine();
					employee.setEmployeeName(employeeName);
					System.out.print("Employee Existing Salary     : " + employee.getEmployeeSalary() + "Employee New Salary : ");
					employeeSalary = Float.parseFloat(bufferedReader.readLine());
					employee.setEmployeeSalary(employeeSalary);
					System.out.print("Employee Existing Address    : " + employee.getEmployeeAddress() + "Employee New Address : ");
					employeeAddress = bufferedReader.readLine();
					employee.setEmployeeAddress(employeeAddress);
					status = employeeService.updateEmployee(employee);
					if(status.equalsIgnoreCase("success")) {
						System.out.println("Employee Updated Successfully");
					}else {
						System.out.println("Employee Updation Failed");
					}
					break;
				case 4: // DELETE
					System.out.println("Employee Number : ");
					employeeNumber = Integer.parseInt(bufferedReader.readLine());
					status = employeeService.deleteEmployee(employeeNumber);
					if(status.equalsIgnoreCase("success")) {
						System.out.println("Employee record deleted Successfully");
					}else {
						System.out.println("Deletion failed");
					}
					break;
				case 5:
					ConnectionFactory.closeConnection();
					System.out.println("Thank you for using this app, Please Visit again!");
					System.exit(0);
					break;
				default:
					System.out.println("Wrong choice entered");
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bufferedReader.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
