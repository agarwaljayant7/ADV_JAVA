package com.jayant.app08.test;

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
//			Class.forName("oracle.jdbc.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","SCOTT","tiger");
			statement = connection.createStatement();
			bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			
			while(true) {
				System.out.print("Employee number    :");
				int eno = Integer.parseInt(bufferedReader.readLine());
				
				System.out.print("Employee name   : ");
				String ename = bufferedReader.readLine();
				
				System.out.print("Employee Salary   :");
				float esal = Float.parseFloat(bufferedReader.readLine());
				
				System.out.println("Employee address      : ");
				String eaddr = bufferedReader.readLine();
				
				int rowCount = statement.executeUpdate("INSERT INTO EMP1 VALUES("+eno+",'"+ename+"',"+esal+",'"+eaddr+"')");
				
				if(rowCount == 1) {
					System.out.println("Employee inserted successfully");
				}
				else {
					System.out.println("Employee insertion failure");
				}
				System.out.println("One more employee ? [yes/no]  : "  );
				String userOption = bufferedReader.readLine();
				
				if(userOption.equalsIgnoreCase("yes")) {
					continue;
				}
				else {
					break;
				}
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
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
