package com.jayant.resultset_meta_data.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		
		try(
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jayantdb","root","root");
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM student");
				){
			ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
			int columnCount = resultSetMetaData.getColumnCount();
			for(int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
				System.out.println("Column Name   : " + resultSetMetaData.getColumnName(columnIndex));
				System.out.println("Column Type   : " + resultSetMetaData.getColumnTypeName(columnIndex));
				System.out.println("Column Size   : " + resultSetMetaData.getColumnDisplaySize(columnIndex));
				System.out.println("--------------------------------------------------------");
				
			}
			System.out.println();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
