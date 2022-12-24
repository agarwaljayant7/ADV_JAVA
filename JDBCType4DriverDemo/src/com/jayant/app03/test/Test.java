package com.jayant.app03.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		
		BufferedReader bufferedReader = null;
//		InputStreamReader inputStreamReader = null;
		Connection connection = null;
		Statement statement = null;	
		String tableName = "";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","SYSTEM","orcl");
			statement = connection.createStatement();
			System.out.println("Table name : ");
			bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			 tableName = bufferedReader.readLine();
			statement.executeUpdate("CREATE TABLE " + tableName + "(SID VARCHAR2(20) PRIMARY KEY, SNAME VARCHAR(2), SADDR VARCHAR2(30))");
			System.out.println("Table " + tableName + " Created Successfully");
				
		}
		catch (Exception e) {
			System.out.println("Table creation failure");
			e.printStackTrace();
		}
		finally {
			try {
//				inputStreamReader.close();
//				bufferedReader.close();
				connection.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				
			}
		}
	}

}
