package com.jayant.app11.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		
		try(
				Connection connection = 
				DriverManager
				.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL",
						"scott","tiger");
				
				Statement statement = connection.createStatement();
			
				ResultSet resultSet = statement.executeQuery("Select * from emp1");
				resultSet.
			)
				
		{
			System.out.println("ENO\t ENAME\t ESAL\t EADDR");
			System.out.println("-----------------------------");
			while(resultSet.next()) {
				
				System.out.print(resultSet.getInt("ENO") + "\t");
				System.out.print(resultSet.getString("ENAME") + "\t");
				System.out.print(resultSet.getFloat("ESAL") + "\t");
				System.out.print(resultSet.getString("EADDR")+"\n");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
