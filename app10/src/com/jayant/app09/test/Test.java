package com.jayant.app09.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {

		try(
				Connection connection = DriverManager.getConnection("jdbc:odbc:jayant","system","orcl");
				Statement statement = connection.createStatement();
				
			) {
				
				int rowCount1 = statement.executeUpdate("CREATE TABLE EMP10(ENO NUMBER(5) PRIMARY KEY, ENAME VARCHAR2(10))");
				int rowCount2 = statement.executeUpdate("DROP TABLE EMP10");
				System.out.println("CREATE QUERY RowCount  : "  + rowCount1);
				System.out.println("DROP QUERY  ROWCOUNT : " + rowCount2);
				
			}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
