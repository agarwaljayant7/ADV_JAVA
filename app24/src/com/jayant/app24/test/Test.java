package com.jayant.app24.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
	
		BufferedReader bufferedReader = null;
		Connection connection  = null;
		Statement statement = null;
		String tableName = "";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","orcl");
			statement = connection.createStatement();
			bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			String query = "CREATE TABLE ";
			System.out.print("ENTER TABLE NAME     : ");
			tableName = bufferedReader.readLine();
			query = query + tableName + "("; // CREATE TABLE EMP1(
			String primaryKey = "";
			int primaryKeyCount = 0;
			
			
			while(true) {
				System.out.print("Column name     : ");
				String colName = bufferedReader.readLine();
				System.out.print("Column Datatype     : ");
				String colType = bufferedReader.readLine();
				System.out.print("Column Size     : ");
				int colSize = Integer.parseInt(bufferedReader.readLine());
				query = query + colName + " "+  colType + "(" + colSize + ")" ;// CREATE TABLE EMP1(ENO NUMBER(5)
				System.out.print("Is Primary Key        : ");
				String primaryKeyOption = bufferedReader.readLine();
				
				if(primaryKeyOption.equalsIgnoreCase("yes")) {
					primaryKeyCount = primaryKeyCount + 1;
					
					if(primaryKeyCount == 1) {
						primaryKey = primaryKey + colName;
					}
					else {
						primaryKey = primaryKey + "," + colName; 
					}
				}
				System.out.print("One more Column     : ");
				String oneMoreColumnOption = bufferedReader.readLine();
				if(oneMoreColumnOption.equalsIgnoreCase("yes")) {
					query = query + ","; // CREATE TABLE EMP1 (ENO NUMBER(5),
					continue;
				}
				else {
					query = query + "," + "PRIMARY KEY(" + primaryKey + "))"; // CREATE TABLE EMP1(ENO NUMBER(5), PRIMARY KEY(ENO))
					break;
				}
			}
			System.out.println(query);
			statement.executeUpdate(query);
			System.out.println("Table " + tableName +" is created successfully");
		}
		catch(Exception e) {
			System.out.println("Table " + tableName + " not created due to " ); 
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
