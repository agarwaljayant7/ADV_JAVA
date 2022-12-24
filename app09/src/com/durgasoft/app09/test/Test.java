package com.durgasoft.app09.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws Exception {
		
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		
		Connection con = DriverManager.getConnection(
				"jdbc:odbc:jayant", "system", "orcl");
		
		Statement st = con.createStatement();
		
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		
		System.out.print("Table name [Sugg: Emp Related] : ");
		String tableName = br.readLine();

		st.executeUpdate("CREATE TABLE " + tableName + "(ENO NUMBER(5) PRIMARY KEY,"
				+ "ENAME VARCHAR2(10), ESAL FLOAT(5), EADDR VARCHAR2(10))");
		System.out.println("Table " + tableName + " created successfully");
		
//		br.close();
		con.close();
	}
}
