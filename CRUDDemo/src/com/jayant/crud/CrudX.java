package com.jayant.crud;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public abstract class CrudX {
	
	public void dropTable() {
		System.out.println("Drop table");
	}
	
	public void insertTable() {
		System.out.println("Inserting into table");
		try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
				Statement statement	= connection.createStatement();
				
			){											// insert into emp11 values(1, 'jayant', 5000, 'blr');
				int rowCount = statement.executeUpdate("INSERT INTO EMP13 VALUES(1, 'JAYANT', 5000, 'BLR')");
				System.out.println("Inserted into Emp13 : " + rowCount);
			}
			catch(Exception e ) {
				e.printStackTrace();
			}
	}
	
}
