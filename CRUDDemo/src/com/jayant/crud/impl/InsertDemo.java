package com.jayant.crud.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo {

	public void insertIntoTable() {
		System.out.println("Inserting");
		try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
				Statement statement	= connection.createStatement();
				
			){											// insert into emp11 values(1, 'jayant', 5000, 'blr');
				int rowCount = statement.executeUpdate("INSERT INTO EMP13 VALUES(1, 'JAYANT', 5000, 'BLR')");
				System.out.println("Inserted : " + rowCount);
			}
			catch(Exception e ) {
				e.printStackTrace();
			}
	}
}
