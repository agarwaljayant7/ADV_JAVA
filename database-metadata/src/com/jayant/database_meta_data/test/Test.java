package com.jayant.database_meta_data.test;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class Test {

	public static void main(String[] args) {
	
		try(
//			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jayantdb", "root", "root")
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		)
		{
			DatabaseMetaData databaseMetaData = connection.getMetaData();
			System.out.println(databaseMetaData.getDatabaseProductName());
			System.out.println(databaseMetaData.getDatabaseProductVersion());
			System.out.println(databaseMetaData.getDriverMinorVersion());
			System.out.println(databaseMetaData.getDriverMajorVersion());
			System.out.println(databaseMetaData.getSQLKeywords());
			System.out.println();
			System.out.println(databaseMetaData.getStringFunctions());
			System.out.println(databaseMetaData.getNumericFunctions());
			System.out.println(databaseMetaData.supportsStoredProcedures());
			System.out.println(databaseMetaData.supportsBatchUpdates());
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
