package com.rdc.app08.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {

		// delete from emp1 where esal < 10000
		
		try (BufferedReader bufferedReader = 
				new BufferedReader(new InputStreamReader(System.in));
			
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","orcl");
			Statement statement = connection.createStatement();
				
			)
		{
			
//			System.out.println("Salary Range :   ");
//			float salaryRange = Float.parseFloat(bufferedReader.readLine());
			
//			int rowCount = statement.executeUpdate("CREATE TABLE EMP4 (ENO NUMBER, ENAME VARCHAR2(10), ESAL FLOAT, EADDR VARCHAR2(10))");
			
			int executeUpdate = statement.executeUpdate("DROP TABLE EMP2");
			System.out.println("Employee DROPPED  : " + executeUpdate);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
