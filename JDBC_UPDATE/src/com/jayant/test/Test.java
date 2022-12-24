package com.jayant.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		
		BufferedReader bufferedReader = null;
		Connection connection = null;
		Statement statement = null;
			
		try {
//			Class.forName("jdbc.odbc.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","SYSTEM","orcl");
			
			statement = connection.createStatement();
			
			bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Bonus amount : ");
			
			int bonusAmount = Integer.parseInt(bufferedReader.readLine());
			
			System.out.println("Salary range : ");
			float salaryRange = Float.parseFloat(bufferedReader.readLine());
			
			
			int rowCount = statement.executeUpdate("UPDATE EMP1 SET ESAL =  ESAL + " + bonusAmount + " WHERE ESAL < " + salaryRange);
			System.out.println("Employeed updated  : " + rowCount);
			
			//UPDATE EMP1 SET ESAL = ESAL + 500 WHERE ESAL < 10000;
		}
		catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bufferedReader.close();
				connection.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
