package com.jayant.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb", "root", "root");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM EMP1");
			System.out.println("");
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
		finally {
			try {
//				resultSet.close();
//				statement.close();
				connection.close();
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}


