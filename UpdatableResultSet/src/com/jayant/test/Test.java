package com.jayant.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		try (
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//				Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jayantdb", "root", "root");
				Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
				ResultSet resultSet = statement.executeQuery("SELECT * FROM EMP1");
				)
		{
			resultSet.moveToInsertRow();
			
				while(true) {
					System.out.println("Employee Number   :");
					int eno = Integer.parseInt(bufferedReader.readLine());
					System.out.println("Employee Name      :");
					String ename = bufferedReader.readLine();
					System.out.println("Employee Salary    :");
					float esal = Float.parseFloat(bufferedReader.readLine());
					System.out.println("Employee Address   :");
					String eaddr = bufferedReader.readLine();
					
					resultSet.updateInt(1, eno);
					resultSet.updateString(2, ename);
					resultSet.updateFloat(3, esal);
					resultSet.updateString(4, eaddr);
					
					resultSet.insertRow();
					System.out.println("Employee " + eno + "inserted successfully");
					System.out.println("One more Employee ? [Yes/No]  : ");
					String option = bufferedReader.readLine();
					if(option.equalsIgnoreCase("yes")) {
						continue;
					}else {
						break;
					}
				}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
