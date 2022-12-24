package com.jayant.database_meta_data.application.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		try (
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jayantdb", "root", "root");
				Statement statement = connection.createStatement();

				
//				ResultSet resultSet = DriverManager.getConnection("jdbc:mysql://localhost:3306/jayantdb", "root", "root")
//										.createStatement()
//										.executeQuery("SELECT * FROM STUDENT");
				){
			System.out.print("Table Name     : ");
		
			String tableName = bufferedReader.readLine();
			System.out.println();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM " + tableName);
			
			ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
			int columnCount = resultSetMetaData.getColumnCount();
			
			for(int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
				System.out.print(resultSetMetaData.getColumnName(columnIndex)+"\t");
				
			}
			System.out.println();
			System.out.println("--------------------------------");
			while(resultSet.next()) {
				for(int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
					System.out.print(resultSet.getString(columnIndex)+"\t");
				}
				System.out.println();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
